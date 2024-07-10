
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 工作人员
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/gongzuorenyuan")
public class GongzuorenyuanController {
    private static final Logger logger = LoggerFactory.getLogger(GongzuorenyuanController.class);

    @Autowired
    private GongzuorenyuanService gongzuorenyuanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("工作人员".equals(role))
            params.put("gongzuorenyuanId",request.getSession().getAttribute("userId"));
        params.put("gongzuorenyuanDeleteStart",1);params.put("gongzuorenyuanDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = gongzuorenyuanService.queryPage(params);

        //字典表数据转换
        List<GongzuorenyuanView> list =(List<GongzuorenyuanView>)page.getList();
        for(GongzuorenyuanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GongzuorenyuanEntity gongzuorenyuan = gongzuorenyuanService.selectById(id);
        if(gongzuorenyuan !=null){
            //entity转view
            GongzuorenyuanView view = new GongzuorenyuanView();
            BeanUtils.copyProperties( gongzuorenyuan , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody GongzuorenyuanEntity gongzuorenyuan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,gongzuorenyuan:{}",this.getClass().getName(),gongzuorenyuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<GongzuorenyuanEntity> queryWrapper = new EntityWrapper<GongzuorenyuanEntity>()
            .eq("username", gongzuorenyuan.getUsername())
            .or()
            .eq("gongzuorenyuan_phone", gongzuorenyuan.getGongzuorenyuanPhone())
            .andNew()
            .eq("gongzuorenyuan_delete", 1)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GongzuorenyuanEntity gongzuorenyuanEntity = gongzuorenyuanService.selectOne(queryWrapper);
        if(gongzuorenyuanEntity==null){
            gongzuorenyuan.setGongzuorenyuanDelete(1);
            gongzuorenyuan.setCreateTime(new Date());
            gongzuorenyuan.setPassword("123456");
            gongzuorenyuanService.insert(gongzuorenyuan);
            return R.ok();
        }else {
            return R.error(511,"账户或者联系方式已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody GongzuorenyuanEntity gongzuorenyuan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,gongzuorenyuan:{}",this.getClass().getName(),gongzuorenyuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<GongzuorenyuanEntity> queryWrapper = new EntityWrapper<GongzuorenyuanEntity>()
            .notIn("id",gongzuorenyuan.getId())
            .andNew()
            .eq("username", gongzuorenyuan.getUsername())
            .or()
            .eq("gongzuorenyuan_phone", gongzuorenyuan.getGongzuorenyuanPhone())
            .andNew()
            .eq("gongzuorenyuan_delete", 1)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GongzuorenyuanEntity gongzuorenyuanEntity = gongzuorenyuanService.selectOne(queryWrapper);
        if("".equals(gongzuorenyuan.getGongzuorenyuanPhoto()) || "null".equals(gongzuorenyuan.getGongzuorenyuanPhoto())){
                gongzuorenyuan.setGongzuorenyuanPhoto(null);
        }
        if(gongzuorenyuanEntity==null){
            gongzuorenyuanService.updateById(gongzuorenyuan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者联系方式已经被使用");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<GongzuorenyuanEntity> list = new ArrayList<>();
        for(Integer id:ids){
            GongzuorenyuanEntity gongzuorenyuanEntity = new GongzuorenyuanEntity();
            gongzuorenyuanEntity.setId(id);
            gongzuorenyuanEntity.setGongzuorenyuanDelete(2);
            list.add(gongzuorenyuanEntity);
        }
        if(list != null && list.size() >0){
            gongzuorenyuanService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<GongzuorenyuanEntity> gongzuorenyuanList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            GongzuorenyuanEntity gongzuorenyuanEntity = new GongzuorenyuanEntity();
//                            gongzuorenyuanEntity.setGongzuorenyuanUuidNumber(data.get(0));                    //工号 要改的
//                            gongzuorenyuanEntity.setUsername(data.get(0));                    //账户 要改的
//                            //gongzuorenyuanEntity.setPassword("123456");//密码
//                            gongzuorenyuanEntity.setGongzuorenyuanName(data.get(0));                    //工作人员姓名 要改的
//                            gongzuorenyuanEntity.setGongzuorenyuanPhoto("");//照片
//                            gongzuorenyuanEntity.setSexTypes(Integer.valueOf(data.get(0)));   //性别 要改的
//                            gongzuorenyuanEntity.setGongzuorenyuanPhone(data.get(0));                    //联系方式 要改的
//                            gongzuorenyuanEntity.setGongzuorenyuanEmail(data.get(0));                    //邮箱 要改的
//                            gongzuorenyuanEntity.setGongzuorenyuanDelete(1);//逻辑删除字段
//                            gongzuorenyuanEntity.setCreateTime(date);//时间
                            gongzuorenyuanList.add(gongzuorenyuanEntity);


                            //把要查询是否重复的字段放入map中
                                //工号
                                if(seachFields.containsKey("gongzuorenyuanUuidNumber")){
                                    List<String> gongzuorenyuanUuidNumber = seachFields.get("gongzuorenyuanUuidNumber");
                                    gongzuorenyuanUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> gongzuorenyuanUuidNumber = new ArrayList<>();
                                    gongzuorenyuanUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("gongzuorenyuanUuidNumber",gongzuorenyuanUuidNumber);
                                }
                                //账户
                                if(seachFields.containsKey("username")){
                                    List<String> username = seachFields.get("username");
                                    username.add(data.get(0));//要改的
                                }else{
                                    List<String> username = new ArrayList<>();
                                    username.add(data.get(0));//要改的
                                    seachFields.put("username",username);
                                }
                                //联系方式
                                if(seachFields.containsKey("gongzuorenyuanPhone")){
                                    List<String> gongzuorenyuanPhone = seachFields.get("gongzuorenyuanPhone");
                                    gongzuorenyuanPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> gongzuorenyuanPhone = new ArrayList<>();
                                    gongzuorenyuanPhone.add(data.get(0));//要改的
                                    seachFields.put("gongzuorenyuanPhone",gongzuorenyuanPhone);
                                }
                        }

                        //查询是否重复
                         //工号
                        List<GongzuorenyuanEntity> gongzuorenyuanEntities_gongzuorenyuanUuidNumber = gongzuorenyuanService.selectList(new EntityWrapper<GongzuorenyuanEntity>().in("gongzuorenyuan_uuid_number", seachFields.get("gongzuorenyuanUuidNumber")).eq("gongzuorenyuan_delete", 1));
                        if(gongzuorenyuanEntities_gongzuorenyuanUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(GongzuorenyuanEntity s:gongzuorenyuanEntities_gongzuorenyuanUuidNumber){
                                repeatFields.add(s.getGongzuorenyuanUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [工号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //账户
                        List<GongzuorenyuanEntity> gongzuorenyuanEntities_username = gongzuorenyuanService.selectList(new EntityWrapper<GongzuorenyuanEntity>().in("username", seachFields.get("username")).eq("gongzuorenyuan_delete", 1));
                        if(gongzuorenyuanEntities_username.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(GongzuorenyuanEntity s:gongzuorenyuanEntities_username){
                                repeatFields.add(s.getUsername());
                            }
                            return R.error(511,"数据库的该表中的 [账户] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //联系方式
                        List<GongzuorenyuanEntity> gongzuorenyuanEntities_gongzuorenyuanPhone = gongzuorenyuanService.selectList(new EntityWrapper<GongzuorenyuanEntity>().in("gongzuorenyuan_phone", seachFields.get("gongzuorenyuanPhone")).eq("gongzuorenyuan_delete", 1));
                        if(gongzuorenyuanEntities_gongzuorenyuanPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(GongzuorenyuanEntity s:gongzuorenyuanEntities_gongzuorenyuanPhone){
                                repeatFields.add(s.getGongzuorenyuanPhone());
                            }
                            return R.error(511,"数据库的该表中的 [联系方式] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        gongzuorenyuanService.insertBatch(gongzuorenyuanList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }


    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        GongzuorenyuanEntity gongzuorenyuan = gongzuorenyuanService.selectOne(new EntityWrapper<GongzuorenyuanEntity>().eq("username", username));
        if(gongzuorenyuan==null || !gongzuorenyuan.getPassword().equals(password))
            return R.error("账号或密码不正确");
        else if(gongzuorenyuan.getGongzuorenyuanDelete() != 1)
            return R.error("账户已被删除");
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(.getRoleTypes());
        String token = tokenService.generateToken(gongzuorenyuan.getId(),username, "gongzuorenyuan", "工作人员");
        R r = R.ok();
        r.put("token", token);
        r.put("role","工作人员");
        r.put("username",gongzuorenyuan.getGongzuorenyuanName());
        r.put("tableName","gongzuorenyuan");
        r.put("userId",gongzuorenyuan.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody GongzuorenyuanEntity gongzuorenyuan){
//    	ValidatorUtils.validateEntity(user);
        Wrapper<GongzuorenyuanEntity> queryWrapper = new EntityWrapper<GongzuorenyuanEntity>()
            .eq("username", gongzuorenyuan.getUsername())
            .or()
            .eq("gongzuorenyuan_phone", gongzuorenyuan.getGongzuorenyuanPhone())
            .andNew()
            .eq("gongzuorenyuan_delete", 1)
            ;
        GongzuorenyuanEntity gongzuorenyuanEntity = gongzuorenyuanService.selectOne(queryWrapper);
        if(gongzuorenyuanEntity != null)
            return R.error("账户或者联系方式已经被使用");
        gongzuorenyuan.setGongzuorenyuanDelete(1);
        gongzuorenyuan.setCreateTime(new Date());
        gongzuorenyuanService.insert(gongzuorenyuan);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        GongzuorenyuanEntity gongzuorenyuan = new GongzuorenyuanEntity();
        gongzuorenyuan.setPassword("123456");
        gongzuorenyuan.setId(id);
        gongzuorenyuanService.updateById(gongzuorenyuan);
        return R.ok();
    }


    /**
     * 忘记密码
     */
    @IgnoreAuth
    @RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request) {
        GongzuorenyuanEntity gongzuorenyuan = gongzuorenyuanService.selectOne(new EntityWrapper<GongzuorenyuanEntity>().eq("username", username));
        if(gongzuorenyuan!=null){
            gongzuorenyuan.setPassword("123456");
            boolean b = gongzuorenyuanService.updateById(gongzuorenyuan);
            if(!b){
               return R.error();
            }
        }else{
           return R.error("账号不存在");
        }
        return R.ok();
    }


    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrGongzuorenyuan(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        GongzuorenyuanEntity gongzuorenyuan = gongzuorenyuanService.selectById(id);
        if(gongzuorenyuan !=null){
            //entity转view
            GongzuorenyuanView view = new GongzuorenyuanView();
            BeanUtils.copyProperties( gongzuorenyuan , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = gongzuorenyuanService.queryPage(params);

        //字典表数据转换
        List<GongzuorenyuanView> list =(List<GongzuorenyuanView>)page.getList();
        for(GongzuorenyuanView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GongzuorenyuanEntity gongzuorenyuan = gongzuorenyuanService.selectById(id);
            if(gongzuorenyuan !=null){


                //entity转view
                GongzuorenyuanView view = new GongzuorenyuanView();
                BeanUtils.copyProperties( gongzuorenyuan , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody GongzuorenyuanEntity gongzuorenyuan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,gongzuorenyuan:{}",this.getClass().getName(),gongzuorenyuan.toString());
        Wrapper<GongzuorenyuanEntity> queryWrapper = new EntityWrapper<GongzuorenyuanEntity>()
            .eq("username", gongzuorenyuan.getUsername())
            .or()
            .eq("gongzuorenyuan_phone", gongzuorenyuan.getGongzuorenyuanPhone())
            .andNew()
            .eq("gongzuorenyuan_delete", 1)
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GongzuorenyuanEntity gongzuorenyuanEntity = gongzuorenyuanService.selectOne(queryWrapper);
        if(gongzuorenyuanEntity==null){
            gongzuorenyuan.setGongzuorenyuanDelete(1);
            gongzuorenyuan.setCreateTime(new Date());
        gongzuorenyuan.setPassword("123456");
        gongzuorenyuanService.insert(gongzuorenyuan);
            return R.ok();
        }else {
            return R.error(511,"账户或者联系方式已经被使用");
        }
    }


}

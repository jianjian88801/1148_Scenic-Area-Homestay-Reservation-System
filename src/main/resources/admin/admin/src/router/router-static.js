import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import fangjian from '@/views/modules/fangjian/list'
    import fangjianLiuyan from '@/views/modules/fangjianLiuyan/list'
    import fnagjianYuye from '@/views/modules/fnagjianYuye/list'
    import gongzuojilu from '@/views/modules/gongzuojilu/list'
    import gongzuorenyuan from '@/views/modules/gongzuorenyuan/list'
    import jingdian from '@/views/modules/jingdian/list'
    import jingdianLiuyan from '@/views/modules/jingdianLiuyan/list'
    import jingdianYuye from '@/views/modules/jingdianYuye/list'
    import meishi from '@/views/modules/meishi/list'
    import meishiLiuyan from '@/views/modules/meishiLiuyan/list'
    import meishiYuye from '@/views/modules/meishiYuye/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryFangjian from '@/views/modules/dictionaryFangjian/list'
    import dictionaryFnagjianYuyeYesno from '@/views/modules/dictionaryFnagjianYuyeYesno/list'
    import dictionaryJingdian from '@/views/modules/dictionaryJingdian/list'
    import dictionaryJingdianYuyeYesno from '@/views/modules/dictionaryJingdianYuyeYesno/list'
    import dictionaryMeishi from '@/views/modules/dictionaryMeishi/list'
    import dictionaryMeishiYuyeYesno from '@/views/modules/dictionaryMeishiYuyeYesno/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryFangjian',
        name: '房间类型',
        component: dictionaryFangjian
    }
    ,{
        path: '/dictionaryFnagjianYuyeYesno',
        name: '审核结果',
        component: dictionaryFnagjianYuyeYesno
    }
    ,{
        path: '/dictionaryJingdian',
        name: '景点类型',
        component: dictionaryJingdian
    }
    ,{
        path: '/dictionaryJingdianYuyeYesno',
        name: '审核结果',
        component: dictionaryJingdianYuyeYesno
    }
    ,{
        path: '/dictionaryMeishi',
        name: '美食类型',
        component: dictionaryMeishi
    }
    ,{
        path: '/dictionaryMeishiYuyeYesno',
        name: '审核结果',
        component: dictionaryMeishiYuyeYesno
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/fangjian',
        name: '房间信息',
        component: fangjian
      }
    ,{
        path: '/fangjianLiuyan',
        name: '房间反馈',
        component: fangjianLiuyan
      }
    ,{
        path: '/fnagjianYuye',
        name: '房间预约',
        component: fnagjianYuye
      }
    ,{
        path: '/gongzuojilu',
        name: '工作记录',
        component: gongzuojilu
      }
    ,{
        path: '/gongzuorenyuan',
        name: '工作人员',
        component: gongzuorenyuan
      }
    ,{
        path: '/jingdian',
        name: '景点信息',
        component: jingdian
      }
    ,{
        path: '/jingdianLiuyan',
        name: '景点反馈',
        component: jingdianLiuyan
      }
    ,{
        path: '/jingdianYuye',
        name: '景点预约',
        component: jingdianYuye
      }
    ,{
        path: '/meishi',
        name: '美食信息',
        component: meishi
      }
    ,{
        path: '/meishiLiuyan',
        name: '美食反馈',
        component: meishiLiuyan
      }
    ,{
        path: '/meishiYuye',
        name: '美食预约',
        component: meishiYuye
      }
    ,{
        path: '/news',
        name: '公告',
        component: news
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

const base = {
    get() {
        return {
            url : "http://localhost:8080/jingquminsuyuyue/",
            name: "jingquminsuyuyue",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/jingquminsuyuyue/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "景区民宿预约系统"
        } 
    }
}
export default base

(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-455b5158"],{"3aa3":function(t,a,e){},"5d46":function(t,a,e){"use strict";e.r(a);var o=function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",{staticClass:"maindiv"},[e("el-card",{staticClass:"mycard"},[e("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[e("span",[e("b",[t._v("审核注册")])])]),e("el-row",[e("el-col",{attrs:{span:10,offset:2}},[e("div",{staticClass:"info"},[e("p",[e("b",[t._v("姓名：")]),t._v(t._s(t.accountDetail.name))]),e("p",[e("b",[t._v("学工号：")]),t._v(t._s(t.accountDetail.id))]),e("p",[e("b",[t._v("邮箱：")]),t._v(t._s(t.accountDetail.email))]),e("p",[e("b",[t._v("注册身份：")]),t._v(t._s(1==t.accountDetail.isTeacher?"教师":"学生"))]),e("el-image",{attrs:{src:t.accountDetail.idcard}})],1)])],1),e("el-row",[e("el-col",{attrs:{span:10,offset:2}},[e("div",{staticClass:"status"},[e("h3",[t._v("审核意见")]),e("el-col",{attrs:{span:2,offset:2}},[e("el-radio",{attrs:{label:"1"},model:{value:t.radio,callback:function(a){t.radio=a},expression:"radio"}},[t._v("通过")])],1),e("el-col",{attrs:{span:2,offset:2}},[e("el-radio",{attrs:{label:"0"},model:{value:t.radio,callback:function(a){t.radio=a},expression:"radio"}},[t._v("不通过")])],1)],1)])],1),e("el-row",[e("el-col",{attrs:{span:5,offset:15}},[e("div",{staticClass:"submit"},[e("router-link",{attrs:{to:"/admin/verification",tag:"el-button",type:"primary"}},[t._v("返回")]),e("el-button",{attrs:{type:"primary"},on:{click:t.submit}},[t._v("提交")])],1)])],1)],1)],1)},c=[],s=e("435a"),i={mounted:function(){var t=this;Object(s["GETUnactivatedAccountID"])(this.accountId).then((function(a){t.accountDetail=a,console.log(a)})).catch((function(a){console.log(a),t.$message("数据请求错误")}))},data:function(){return{accountId:this.$route.query.ID,accountDetail:{email:"",name:"",password:"",idcard:"",id:"",isTeacher:!0,isSeniorTercher:!0},radio:null,textarea:"",ruleForm:{name:"",content:""}}},methods:{submit:function(){var t=this;console.log(this.radio),null==this.radio?this.$message("请选择审核意见！"):1==this.radio?Object(s["ActivateAccount"])(this.accountId).then((function(a){t.accountDetail=a,t.$message("已通过"),console.log(a),t.$router.push({path:"/admin/verification"})})).catch((function(a){console.log(a),t.$message("提交失败")})):Object(s["DELETEUnactivatedAccount"])(this.accountId).then((function(a){t.accountDetail=a,t.$message("已拒绝"),console.log(a),t.$router.push({path:"/admin/verification"})})).catch((function(a){console.log(a),t.$message("提交失败")}))}}},n=i,l=(e("9955"),e("2877")),r=Object(l["a"])(n,o,c,!1,null,"b3eec5f8",null);a["default"]=r.exports},9955:function(t,a,e){"use strict";e("3aa3")}}]);
//# sourceMappingURL=chunk-455b5158.a1d78e65.js.map
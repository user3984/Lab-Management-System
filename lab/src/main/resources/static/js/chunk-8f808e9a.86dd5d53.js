(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-8f808e9a"],{"0755":function(t,e,o){},"09bc":function(t,e,o){"use strict";o("0755")},1960:function(t,e,o){"use strict";o.r(e);var i=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("el-card",{staticClass:"maincard"},[o("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[o("span",[o("b",[t._v(t._s(t.labName)+" - 实验报告")])])]),o("div",{staticStyle:{margin:"40px"}},[o("p",[t._v("1. 实验目的")]),o("quill-editor",{ref:"purposeEditor",staticClass:"editor",attrs:{options:t.editorOption},model:{value:t.purpose,callback:function(e){t.purpose=e},expression:"purpose"}}),o("p",[t._v("2. 实验原理")]),o("quill-editor",{ref:"principleEditor",staticClass:"editor",attrs:{options:t.editorOption},model:{value:t.principle,callback:function(e){t.principle=e},expression:"principle"}}),o("p",[t._v("3. 实验总结")]),o("quill-editor",{ref:"conslusionEditor",staticClass:"editor",attrs:{options:t.editorOption},model:{value:t.conclusion,callback:function(e){t.conclusion=e},expression:"conclusion"}}),o("div",{staticStyle:{padding:"20px"},attrs:{align:"center"}},[o("el-button",{attrs:{size:"medium",type:"primary"},on:{click:t.submitForm}},[t._v("提交")]),o("el-button",{attrs:{size:"medium"},on:{click:t.back}},[t._v("取消")])],1)],1)])},s=[],n=o("fcc2"),r=o("435a"),l={mounted:function(){var t=this,e={courseId:this.courseId,sectionId:this.sectionId,labId:this.labId,studentId:n["a"].state.id};Object(r["s"])(e).then((function(e){console.log("data**",e),t.purpose=e.purpose,t.principle=e.principle,t.conclusion=e.progress,console.log("report",t.reportForm)})).catch((function(e){console.log(e),t.$message("报告信息获取错误")}))},data:function(){return{editorOption:{modules:{toolbar:[["bold","italic","underline","strike"],["blockquote","code-block"],[{header:[1,2,3,4,5,6,!1]}],[{list:"ordered"},{list:"bullet"}],[{script:"sub"},{script:"super"}],[{indent:"-1"},{indent:"+1"}],[{size:["small",!1,"large","huge"]}],[{color:[]},{background:[]}],[{font:[]}],[{align:[]}],["clean"],["image"]]},placeholder:"请在这里填写内容",theme:"snow",syntax:!0},labId:this.$route.params.labId,labName:this.$route.params.labName,courseId:this.$route.params.courseId,sectionId:this.$route.params.sectionId,lab:{title:""},options:[],purpose:null,principle:null,conclusion:null,OrgID:n["a"].state.ID,groundId:null}},methods:{back:function(){this.$router.go(-1)},handleChange:function(t){console.log(t)},submitForm:function(){var t=this;Object(r["J"])({studentId:n["a"].state.id,courseId:String(this.courseId),sectionId:String(this.sectionId),labId:String(this.labId),url:null,grades:0,purpose:this.purpose,progress:this.conclusion,principle:this.principle}).then((function(){t.$alert("提交成功"),t.$router.go(-1)})).catch((function(e){console.log(e),t.$message("提交失败")}))}}},c=l,a=(o("09bc"),o("ee31"),o("2877")),u=Object(a["a"])(c,i,s,!1,null,"722d6ef6",null);e["default"]=u.exports},"91a7":function(t,e,o){},ee31:function(t,e,o){"use strict";o("91a7")}}]);
//# sourceMappingURL=chunk-8f808e9a.86dd5d53.js.map
//创建验证码
$(document).ready(function () {
    var code; //在全局 定义验证码
    createCode();
    $("#t1").blur(function () {
        but();
    });
    $(".c").click(function(){
        createCode();
    });
function createCode()
{ //创建验证码函数
    code = "";
    var codeLength =4;//验证码的长度
    var selectChar = new Array(0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','i','j','k',
        'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');//所有候选组成验证码的字符，当然也可以用中文的
    for(var i=0;i<codeLength;i++)
    {
        var charIndex =Math.floor(Math.random()*36);
        code +=selectChar[charIndex];
    }
// 设置验证码的显示样式，并显示
    document.getElementById("discode").style.fontFamily="Fixedsys"; //设置字体
    document.getElementById("discode").style.letterSpacing="5px"; //字体间距
    document.getElementById("discode").style.color="#0ab000"; //字体颜色
    document.getElementById("discode").innerHTML=code; // 显示
}
function but()
{
    //验证验证码输入是否正确
    var val1=document.getElementById("t1").value;
    var val2=code;
    if(val1!=val2){
        alert("验证码错误!");
        document.getElementById('t1').value="";
    }
}
    //图片上传
    $(".myfile").fileinput({
        //上传的地址
        uploadUrl:"/uploadFile",
        uploadAsync : true, //默认异步上传
        showUpload : false, //是否显示上传按钮,跟随文本框的那个
        showRemove : false, //显示移除按钮,跟随文本框的那个
        showCaption : true,//是否显示标题,就是那个文本框
        showPreview : true, //是否显示预览,不写默认为true
        dropZoneEnabled : false,//是否显示拖拽区域，默认不写为true，但是会占用很大区域
        //minImageWidth: 50, //图片的最小宽度
        //minImageHeight: 50,//图片的最小高度
        //maxImageWidth: 1000,//图片的最大宽度
        //maxImageHeight: 1000,//图片的最大高度
        //maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
        //minFileCount: 0,
        maxFileCount : 1, //表示允许同时上传的最大文件个数
        enctype : 'multipart/form-data',
        validateInitialCount : true,
        previewFileIcon : "<i class='glyphicon glyphicon-king'></i>",
        msgFilesTooMany : "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
        allowedFileTypes : [ 'image' ],//配置允许文件上传的类型
        allowedPreviewTypes : [ 'image' ],//配置所有的被预览文件类型
        allowedPreviewMimeTypes : [ 'jpg', 'png', 'gif' ],//控制被预览的所有mime类型
        language : 'zh'
    });
    //异步上传返回结果处理
    $('.myfile').on('fileerror', function(event, data, msg) {
        console.log("fileerror");
        console.log(data);
    });
    //异步上传返回结果处理
    $(".myfile").on("fileuploaded", function(event, data, previewId, index) {
        console.log("fileuploaded");
        var ref = $(this).attr("data-ref");
        $("#headPortrait").val()
    });

    //同步上传错误处理
    $('.myfile').on('filebatchuploaderror', function(event, data, msg) {
        console.log("filebatchuploaderror");
        console.log(data);
    });

    //同步上传返回结果处理
    $(".myfile").on("filebatchuploadsuccess",
        function(event, data, previewId, index) {
            console.log("filebatchuploadsuccess");
            console.log(data);
        });

    //上传前
    $('.myfile').on('filepreupload', function(event, data, previewId, index) {
        console.log("filepreupload");
    });

    //检验用户名是否存在
    $("#username").blur(function () {
       var username = $(this).val();
       if (username != null){
           $.ajax({
               url: "/selectOneUser/"+username,
               type: "GET",
               success:function (result) {
                   if (result !=null){
                      $(".error").attr({"display":"block","value":"用户名已存在!"});
                   }else {
                       $(".error").attr({"display":"block","value":"用户名可用!"});
                   }
               }
           })
       }
    })
});
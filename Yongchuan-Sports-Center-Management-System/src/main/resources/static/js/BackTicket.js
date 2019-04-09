$.noConflict();

jQuery(document).ready(function($) {

    "use strict";

    [].slice.call( document.querySelectorAll( 'select.cs-select' ) ).forEach( function(el) {
        new SelectFx(el);
    });

    jQuery('.selectpicker').selectpicker;




    $('.search-trigger').on('click', function(event) {
        event.preventDefault();
        event.stopPropagation();
        $('.search-trigger').parent('.header-left').addClass('open');
    });

    $('.search-close').on('click', function(event) {
        event.preventDefault();
        event.stopPropagation();
        $('.search-trigger').parent('.header-left').removeClass('open');
    });

    $('.equal-height').matchHeight({
        property: 'max-height'
    });

    // var chartsheight = $('.flotRealtime2').height();
    // $('.traffic-chart').css('height', chartsheight-122);


    // Counter Number
    $('.count').each(function () {
        $(this).prop('Counter',0).animate({
            Counter: $(this).text()
        }, {
            duration: 3000,
            easing: 'swing',
            step: function (now) {
                $(this).text(Math.ceil(now));
            }
        });
    });




    // Menu Trigger
    $('#menuToggle').on('click', function(event) {
        var windowWidth = $(window).width();
        if (windowWidth<1010) {
            $('body').removeClass('open');
            if (windowWidth<760){
                $('#left-panel').slideToggle();
            } else {
                $('#left-panel').toggleClass('open-menu');
            }
        } else {
            $('body').toggleClass('open');
            $('#left-panel').removeClass('open-menu');
        }

    });


    $(".menu-item-has-children.dropdown").each(function() {
        $(this).on('click', function() {
            var $temp_text = $(this).children('.dropdown-toggle').html();
            $(this).children('.sub-menu').prepend('<li class="subtitle">' + $temp_text + '</li>');
        });
    });


    // Load Resize
    $(window).on("load resize", function(event) {
        var windowWidth = $(window).width();
        if (windowWidth<1010) {
            $('body').addClass('small-device');
        } else {
            $('body').removeClass('small-device');
        }

    });
   //点击删除按钮发送删除信息
    $('.delete').on('click', function() {
    var r=confirm("确认删除么？");
      if (r==true)
        {
            var id = $(this).parent().parent().find("td:eq(1)").text();
            $.ajax({
                url:"/ticket/"+id,
                type:"DELETE",
                success:function (result) {
                    alert(result);
                    window.location.reload();
                }
            });
        }
      else
        {
        alert("你拒绝了本次操作！");
        }
    });

    //查询数据库，将这个人的信息查询出来，填入到各个input标签中
    $(".edit").on("click",function(){
        var id = $(this).parent().parent().find("td:eq(1)").text();
       $.ajax({
            url:"/ticket/"+id,
            type:"GET",
            success:function(result){
                console.log(result);
                $("#id").val(result.id);
                $("#title").val(result.title);
                $("#address").val(result.address);
                $("#detailedAddress").val(result.detailedAddress);
                $("#showTimeStart").val(result.showTimeStart);
                $("#showTimeEnd").val(result.showTimeStart);
                $("#aArea").val(result.aArea);
                $("#bArea").val(result.bArea);
                $("#cArea").val(result.cArea);
                $("#dArea").val(result.dArea);
                $("#eArea").val(result.eArea);
                $("#fArea").val(result.fArea);
                $("#week option[value='"+result.week+"']").attr("selected","selected");
                $("#price").val(result.price);
                $("#explain").val(result.explain);
                $("#number").val(result.number);
                $("#state").val(result.state);
                $("#poste").attr("src",result.poster);
                $("#type option[value='"+result.type+"']").attr("selected","selected");
                $("#subtype").empty();
                if (result.type == "Music") {
                    $("#subtype").append(
                        "<option value='Chorus'>声乐及合唱</option>"
                        +"<option value='AncientMusic'>室内乐及古乐</option>"
                        +"<option value='Solo'>独奏</option>"
                        +"<option value='Other'>其他</option>"
                    )
                }else if (result.type == "Theatre") {
                    $("#subtype").append(
                        "<option value='Drama'>话剧</option>"
                        +"<option value='Opera'>歌剧</option>"
                        +"<option value='TheLivingTheatre'>舞台剧</option>"
                        +"<option value='Other'>其他</option>"
                    )
                }else if (result.type == "Concert") {
                    $("#subtype").append(
                        "<option value='Rock'>摇滚</option>"
                        +"<option value='Nation'>民族</option>"
                        +"<option value='Popular'>流行</option>"
                        +"<option value='Festival'>音乐节</option>"
                        +"<option value='Sir'>爵士</option>"
                        +"<option value='Other'>其他</option>"
                    )
                }else if (result.type == "Dance") {
                    $("#subtype").append(
                        "<option value='LatinDance'>拉丁舞</option>"
                        +"<option value='ModernDance'>现代舞</option>"
                        +"<option value='FolkDance'>民族舞</option>"
                        +"<option value='Ballet'>芭蕾舞</option>"
                        +"<option value='Jazz'>爵士舞</option>"
                        +"<option value='ModernDancing'>摩登舞</option>"
                        +"<option value='Other'>其他</option>"
                    )
                }else if (result.type == "TraditionalOpera") {
                    $("#subtype").append(
                        "<option value='BeijingOpera'>京剧</option>"
                        +"<option value='ShaoxingOpera'>越剧</option>"
                        +"<option value='Huangmeixi'>黄梅戏</option>"
                        +"<option value='PingJuOpera'>评剧</option>"
                        +"<option value='HenanOpera'>豫剧</option>"
                        +"<option value='Other'>其他</option>"
                    )
                }else if (result.type == "Sports") {
                    $("#subtype").append(
                        "<option value='Football'>足球</option>"
                        +"<option value='Basketball'>篮球</option>"
                        +"<option value='TableTennis'>乒乓球</option>"
                        +"<option value='Swimming'>游泳</option>"
                        +"<option value='Bodybuilding'>健身</option>"
                        +"<option value='Badminton'>羽毛球</option>"
                        +"<option value='Athletics'>田径</option>"
                        +"<option value='Tennis'>网球</option>"
                        +"<option value='Shotput'>铅球</option>"
                        +"<option value='Other'>其他</option>"
                    )
                }else if (result.type == "Acrobatics") {
                    $("#subtype").append(
                        "<option value='Acrobatics'>器械杂技</option>"
                        +"<option value='BodyAcrobatics'>形体杂技</option>"
                        +"<option value='AerialAcrobatics'>高空杂技</option>"
                        +"<option value='OralSkills'>口技</option>"
                        +"<option value='Other'>其他</option>"
                    )
                }
                $("#subtype option[value='"+result.subtype+"']").attr("selected","selected");
            }
        });
        $("#subtype option[value='"+type+"']").attr("selected","selected");
        $("#empUpdateModal").modal({
            backdrop:"static"
        });
    });

     //更新数据
    $("#update").click(function () {
        var formData = new FormData($("#empUpdateModal form")[0]);
        $.ajax({
            url:"/updateTicket",
            type:"Post",
            data:formData,//得到表单里面的值
            contentType:false,
            async : false,
            processData:false,//这个很有必要，不然不行
            dataType:"json",
            mimeType:"multipart/form-data",
            success:function(result){
                alert(result);
                $("#empUpdateModal").modal("hide");
                window.location.reload();
            }
        });
    });

    //显示新增演出页面
    $("#addShow").on("click",function(){
        $("#empUpdateModal1").modal({
            backdrop:"static"
        });
    });


    //新增演出
    $("#add").click(function () {
        var xx = $("#number1").val();
        $("#numberSurplus").val(xx);
        var formData = new FormData($("#empUpdateModal1 form")[0]);
        $.ajax({
            url:"/ticket/",
            type:"POST",
            data:formData,//得到表单里面的值
            contentType:false,
            async : false,
            processData:false,//这个很有必要，不然不行
            dataType:"json",
            mimeType:"multipart/form-data",
            success:function(result){
                alert(result);
                $("#empUpdateModal").modal("hide");
                window.location.reload();
            }
        });
    });

    //给全选设置点击事件
    $(document).ready(function() {
        $("[name='allSel']").click(function() {
            if ($(this).is(':checked')) {
                $("[name='select']").prop('checked', true);
            } else {
                $("[name='select']").prop('checked', false);
            }
        });
        $("[name='select']").click(function() {
            var allSel = false;
            $("[name='select']").each(function() {
                if (!$(this).is(':checked')) {
                    allSel = true;
                }
            });
            if (allSel) {
                $("[name='allSel']").prop('checked', false);
            } else {
                $("[name='allSel']").prop('checked', true);
            }
        })
    });
    //批量删除
    $("#deletes").click(function () {
        var users = new Array();
        $("[name='select']").each(function() {
            if ($(this).is(':checked')) {
                var user = $(this).parent().parent().find("td:eq(1)").text();
                users.push(user);
            }
        });
        $.ajax({
            url:"/tickets/"+users,
            type:"DELETE",
            success:function (result) {
                alert(result);
                window.location.reload();
            }
        })
    });

    //开始售票
    $("#start").click(function () {
        var ids = new Array();
        $("[name='select']").each(function() {
            if ($(this).is(':checked')) {
                var id = $(this).parent().parent().find("td:eq(1)").text();
                ids.push(id);
            }
        });
        $.ajax({
            url:"/tickets/"+ids,
            type:"PUT",
            success:function (result) {
                alert(result);
                window.location.reload();
            }
        })
    });

    laydate.render({
        elem: '#showTimeStart', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#showTimeEnd', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#showTimeStart1', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#showTimeEnd1', //指定元素
        type: 'datetime'
    });
    //开始默认音乐会
    $("#subtype1").append(
        "<option value='Chorus'>声乐及合唱</option>"
        +"<option value='AncientMusic'>室内乐及古乐</option>"
        +"<option value='Solo'>独奏</option>"
        +"<option value='Other'>其他</option>"
    );
    //根据选择的类型出现子类
    $("#type").change(function () {
        $("#subtype").empty();
        var type = $(this).val();
        if (type == "Music") {
            $("#subtype").append(
                "<option value='Chorus'>声乐及合唱</option>"
                +"<option value='AncientMusic'>室内乐及古乐</option>"
                +"<option value='Solo'>独奏</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "Theatre") {
            $("#subtype").append(
                "<option value='Drama'>话剧</option>"
                +"<option value='Opera'>歌剧</option>"
                +"<option value='TheLivingTheatre'>舞台剧</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "Concert") {
            $("#subtype").append(
                "<option value='Rock'>摇滚</option>"
                +"<option value='Nation'>民族</option>"
                +"<option value='Popular'>流行</option>"
                +"<option value='Festival'>音乐节</option>"
                +"<option value='Sir'>爵士</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "Dance") {
            $("#subtype").append(
                "<option value='LatinDance'>拉丁舞</option>"
                +"<option value='ModernDance'>现代舞</option>"
                +"<option value='FolkDance'>民族舞</option>"
                +"<option value='Ballet'>芭蕾舞</option>"
                +"<option value='Jazz'>爵士舞</option>"
                +"<option value='ModernDancing'>摩登舞</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "TraditionalOpera") {
            $("#subtype").append(
                "<option value='BeijingOpera'>京剧</option>"
                +"<option value='ShaoxingOpera'>越剧</option>"
                +"<option value='Huangmeixi'>黄梅戏</option>"
                +"<option value='PingJuOpera'>评剧</option>"
                +"<option value='HenanOpera'>豫剧</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "Sports") {
            $("#subtype").append(
                "<option value='Football'>足球</option>"
                +"<option value='Basketball'>篮球</option>"
                +"<option value='TableTennis'>乒乓球</option>"
                +"<option value='Swimming'>游泳</option>"
                +"<option value='Bodybuilding'>健身</option>"
                +"<option value='Badminton'>羽毛球</option>"
                +"<option value='Athletics'>田径</option>"
                +"<option value='Tennis'>网球</option>"
                +"<option value='Shotput'>铅球</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "Acrobatics") {
            $("#subtype").append(
                "<option value='Acrobatics'>器械杂技</option>"
                +"<option value='BodyAcrobatics'>形体杂技</option>"
                +"<option value='AerialAcrobatics'>高空杂技</option>"
                +"<option value='OralSkills'>口技</option>"
                +"<option value='Other'>其他</option>"
            )
        }
    }) ;
    $("#type1").change(function () {
        $("#subtype1").empty();
        var type = $(this).val();
        if (type == "Music") {
            $("#subtype1").append(
                "<option value='Chorus'>声乐及合唱</option>"
                +"<option value='AncientMusic'>室内乐及古乐</option>"
                +"<option value='Solo'>独奏</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "Theatre") {
            $("#subtype1").append(
                "<option value='Drama'>话剧</option>"
                +"<option value='Opera'>歌剧</option>"
                +"<option value='TheLivingTheatre'>舞台剧</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "Concert") {
            $("#subtype1").append(
                "<option value='Rock'>摇滚</option>"
                +"<option value='Nation'>民族</option>"
                +"<option value='Popular'>流行</option>"
                +"<option value='Festival'>音乐节</option>"
                +"<option value='Sir'>爵士</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "Dance") {
            $("#subtype1").append(
                "<option value='LatinDance'>拉丁舞</option>"
                +"<option value='ModernDance'>现代舞</option>"
                +"<option value='FolkDance'>民族舞</option>"
                +"<option value='Ballet'>芭蕾舞</option>"
                +"<option value='Jazz'>爵士舞</option>"
                +"<option value='ModernDancing'>摩登舞</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "TraditionalOpera") {
            $("#subtype1").append(
                "<option value='BeijingOpera'>京剧</option>"
                +"<option value='ShaoxingOpera'>越剧</option>"
                +"<option value='Huangmeixi'>黄梅戏</option>"
                +"<option value='PingJuOpera'>评剧</option>"
                +"<option value='HenanOpera'>豫剧</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "Sports") {
            $("#subtype1").append(
                "<option value='Football'>足球</option>"
                +"<option value='Basketball'>篮球</option>"
                +"<option value='TableTennis'>乒乓球</option>"
                +"<option value='Swimming'>游泳</option>"
                +"<option value='Bodybuilding'>健身</option>"
                +"<option value='Badminton'>羽毛球</option>"
                +"<option value='Athletics'>田径</option>"
                +"<option value='Tennis'>网球</option>"
                +"<option value='Shotput'>铅球</option>"
                +"<option value='Other'>其他</option>"
            )
        }else if (type == "Acrobatics") {
            $("#subtype1").append(
                "<option value='Acrobatics'>器械杂技</option>"
                +"<option value='BodyAcrobatics'>形体杂技</option>"
                +"<option value='AerialAcrobatics'>高空杂技</option>"
                +"<option value='OralSkills'>口技</option>"
                +"<option value='Other'>其他</option>"
            )
        }
    });
});
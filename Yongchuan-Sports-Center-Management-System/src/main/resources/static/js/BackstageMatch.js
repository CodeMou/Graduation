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
    	var id = $(this).parent().parent().find("td:eq(1)").text();
    	$.ajax({
                url:"/match/"+id,
				type:"DELETE",
				success:function (result) {
					alert(result);
					window.location.reload();
                }
		});
    });

    //查询数据库，将这个人的信息查询出来，填入到各个input标签中
    $(".edit").on("click",function(){
        var id = $(this).parent().parent().find("td:eq(1)").text();
        $.ajax({
            url:"/match/"+id,
            type:"GET",
            success:function(result){
                console.log(result);
                $("#id").val(result.id);
                $("#name").val(result.name);
                $("#category option[value='"+result.category+"']").attr("selected","selected");
                $("#number").val(result.number);
                $("#organizer").val(result.organizer);
                $("#description").val(result.description);
                $("#subjectTimeStart").val(result.subjectTimeStart);
                $("#subjectTimeEnd").val(result.subjectTimeEnd);
                $("#matchTimeStart").val(result.matchTimeStart);
                $("#matchTimeEnd").val(result.matchTimeEnd);
                $("#subject").empty();
                if (result.category == "Football") {
                    $("#subject").append(
                        "<option value='Eleven'>11人制</option>"
                    )
                }else if (result.category == "Basketball") {
                    $("#subject").append(
                        "<option value='5V5'>5V5</option>"
                    )
                }else if (result.category == "TableTennis") {
                    $("#subject").append(
                        "<option value='manOne'>男子单打</option>"
                        +"<option value='manTwo'>男子双打</option>"
                        +"<option value='womanOne'>女子单打</option>"
                        +"<option value='womanTwo'>女子双打</option>"
                        +"<option value='mix'>混合双打</option>"
                    )
                }else if (result.category == "Swimming") {
                    $("#subject").append(
                        "<option value='backstroke'>100米仰泳</option>"
                        +"<option value='Breaststroke'>100米蛙泳</option>"
                        +"<option value='Butterfly'>100米蝶泳</option>"
                        +"<option value='Free'>100米自由泳</option>"
                    )
                }else if (result.category == "Badminton") {
                    $("#subject").append(
                        "<option value='man_One'>男子单打</option>"
                        +"<option value='man_Two'>男子双打</option>"
                        +"<option value='woman_One'>女子单打</option>"
                        +"<option value='woman_Two'>女子双打</option>"
                        +"<option value='mix_'>混合双打</option>"
                    )
                }else if (result.category == "Athletics") {
                    $("#subject").append(
                        "<option value='50'>50米跑</option>"
                        +"<option value='100'>100米跑</option>"
                        +"<option value='200'>200米跑</option>"
                        +"<option value='400'>400米跑</option>"
                        +"<option value='800'>800米跑</option>"
                        +"<option value='1500'>1500米跑</option>"
                        +"<option value='highJump'>跳高</option>"
                        +"<option value='longJump'>跳远</option>"
                    )
                }
            }
        });

        $("#empUpdateModal").modal({
            backdrop:"static"
        });
    });

    //更新数据
    $("#update").click(function () {
        $.ajax({
            url:"/match/",
            type:"PUT",
            data:$("#empUpdateModal form").serialize(),//得到表单里面的值
            success:function(result){
                alert(result);
                $("#empUpdateModal").modal("hide");
                window.location.reload();
            }
        });
    });

	//显示新增用户页面
    $("#addMatch").on("click",function(){
        $("#empUpdateModal1").modal({
            backdrop:"static"
        });
	})

   //新增用户
    $("#add").click(function () {
        $.ajax({
            url:"/match/",
            type:"POST",
            data:$("#empUpdateModal1 form").serialize(),//得到表单里面的值
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
    	var ids = new Array();
        $("[name='select']").each(function() {
            if ($(this).is(':checked')) {
                var user = $(this).parent().parent().find("td:eq(1)").text();
               ids.push(user);
            }
        });
        $.ajax({
			url:"/matchs/"+ids,
			type:"DELETE",
			success:function (result) {
			alert(result);
			window.location.reload();
            }
		})
    });

    $("#start").click(function () {
    	var ids = new Array();
        $("[name='select']").each(function() {
            if ($(this).is(':checked')) {
                var user = $(this).parent().parent().find("td:eq(1)").text();
               ids.push(user);
            }
        });
        $.ajax({
			url:"/matchs/"+ids,
			type:"PUT",
			success:function (result) {
			alert(result);
			window.location.reload();
            }
		})
    });

    laydate.render({
        elem: '#subjectTimeStart', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#matchTimeStart', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#subjectTimeEnd', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#matchTimeEnd', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#subjectTimeStart1', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#matchTimeStart1', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#subjectTimeEnd1', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#matchTimeEnd1', //指定元素
        type: 'datetime'
    });

    //开始默认运动
    $("#subject1").append(
        "<option value='Eleven'>11人制</option>"
    );
    //根据选择的类型出现子类
    $("#category").change(function () {
        $("#subject").empty();
        var type = $(this).val();
        if (type == "Football") {
            $("#subject").append(
                "<option value='Eleven'>11人制</option>"
            )
        }else if (type == "Basketball") {
            $("#subject").append(
                "<option value='5V5'>5V5</option>"
            )
        }else if (type == "TableTennis") {
            $("#subject").append(
                "<option value='manOne'>男子单打</option>"
                +"<option value='manTwo'>男子双打</option>"
                +"<option value='womanOne'>女子单打</option>"
                +"<option value='womanTwo'>女子双打</option>"
                +"<option value='mix'>混合双打</option>"
            )
        }else if (type == "Swimming") {
            $("#subject").append(
                "<option value='backstroke'>100米仰泳</option>"
                +"<option value='Breaststroke'>100米蛙泳</option>"
                +"<option value='Butterfly'>100米蝶泳</option>"
                +"<option value='Free'>100米自由泳</option>"
            )
        }else if (type == "Badminton") {
            $("#subject").append(
                "<option value='man_One'>男子单打</option>"
                +"<option value='man_Two'>男子双打</option>"
                +"<option value='woman_One'>女子单打</option>"
                +"<option value='woman_Two'>女子双打</option>"
                +"<option value='mix_'>混合双打</option>"
            )
        }else if (type == "Athletics") {
            $("#subject").append(
                "<option value='50'>50米跑</option>"
                +"<option value='100'>100米跑</option>"
                +"<option value='200'>200米跑</option>"
                +"<option value='400'>400米跑</option>"
                +"<option value='800'>800米跑</option>"
                +"<option value='1500'>1500米跑</option>"
                +"<option value='highJump'>跳高</option>"
                +"<option value='longJump'>跳远</option>"
            )
        }
    }) ;
    $("#category1").change(function () {
        $("#subject1").empty();
        var type = $(this).val();
        if (type == "Football") {
            $("#subject1").append(
                "<option value='Eleven'>11人制</option>"
            )
        }else if (type == "Basketball") {
            $("#subject1").append(
                "<option value='5V5'>5V5</option>"
            )
        }else if (type == "TableTennis") {
            $("#subject1").append(
                "<option value='manOne'>男子单打</option>"
                +"<option value='manTwo'>男子双打</option>"
                +"<option value='womanOne'>女子单打</option>"
                +"<option value='womanTwo'>女子双打</option>"
                +"<option value='mix'>混合双打</option>"
            )
        }else if (type == "Swimming") {
            $("#subject1").append(
                "<option value='backstroke'>100米仰泳</option>"
                +"<option value='Breaststroke'>100米蛙泳</option>"
                +"<option value='Butterfly'>100米蝶泳</option>"
                +"<option value='Free'>100米自由泳</option>"
            )
        }else if (type == "Badminton") {
            $("#subject1").append(
                "<option value='man_One'>男子单打</option>"
                +"<option value='man_Two'>男子双打</option>"
                +"<option value='woman_One'>女子单打</option>"
                +"<option value='woman_Two'>女子双打</option>"
                +"<option value='mix_'>混合双打</option>"
            )
        }else if (type == "Athletics") {
            $("#subject1").append(
                "<option value='50'>50米跑</option>"
                +"<option value='100'>100米跑</option>"
                +"<option value='200'>200米跑</option>"
                +"<option value='400'>400米跑</option>"
                +"<option value='800'>800米跑</option>"
                +"<option value='1500'>1500米跑</option>"
                +"<option value='highJump'>跳高</option>"
                +"<option value='longJump'>跳远</option>"
            )
        }
    }) ;
});
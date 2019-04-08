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
                url:"/train/"+id,
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
            url:"/train/"+id,
            type:"GET",
            success:function(result){
                console.log(result);
                $("#id").val(result.id);
                $("#subtype option[value='"+result.subject+"']").attr("selected","selected");
                $("#teacher").val(result.teacher);
                $("#quota").val(result.quota);
                $("#surplus").val(result.surplus);
                $("#totalHours").val(result.totalHours);
                $("#hours").val(result.hours);
                $("#everydayHours").val(result.everydayHours);
                $("#startTime").val(result.startTime);
                $("#description").val(result.description);
            }
        });

        $("#empUpdateModal").modal({
            backdrop:"static"
        });
    });

    //更新数据
    $("#update").click(function () {
        $.ajax({
            url:"/train",
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
    $("#addTrain").on("click",function(){
        $("#empUpdateModal1").modal({
            backdrop:"static"
        });
	});

   //新增用户
    $("#add").click(function () {
        var xx = $("#quota1").val();
        $("#surplus").val(xx);
        alert(xx);
        $.ajax({
            url:"/train",
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
			url:"/trains/"+ids,
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
			url:"/trains/"+ids,
			type:"PUT",
			success:function (result) {
			alert(result);
			window.location.reload();
            }
		})
    });

    laydate.render({
        elem: '#startTime', //指定元素
        type: 'datetime'
    });
    laydate.render({
        elem: '#startTime1', //指定元素
        type: 'datetime'
    });
});
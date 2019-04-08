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
    	var id = $(this).parent().parent().find("td:eq(0)").text();
    	$.ajax({
                url:"/field/"+id,
				type:"DELETE",
				success:function (result) {
					alert(result);
					window.location.reload();
                }
		});
    });

    //查询数据库，将这个人的信息查询出来，填入到各个input标签中
    $(".edit").on("click",function(){
        var id = $(this).parent().parent().find("td:eq(0)").text();
        $.ajax({
            url:"/field/"+id,
            type:"GET",
            success:function(result){
                console.log(result);
                $("#id").val(result.id);
                $("#name").val(result.name);
                $("#number").val(result.number);
                $("#openTimeStart").val(result.openTimeStart.substring(0,2)+":"+result.openTimeStart.substring(2,4)+":"+result.openTimeStart.substring(4,6));
                $("#openTimeEnd").val(result.openTimeEnd.substring(0,2)+":"+result.openTimeEnd.substring(2,4)+":"+result.openTimeEnd.substring(4,6));
            }
        });

        $("#empUpdateModal").modal({
            backdrop:"static"
        });
    });

    //更新数据
    $("#update").click(function () {
        $.ajax({
            url:"/field/",
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
    $("#addField").on("click",function(){
        $("#empUpdateModal1").modal({
            backdrop:"static"
        });
	})

   //新增用户
    $("#add").click(function () {
        $.ajax({
            url:"/field/",
            type:"POST",
            data:$("#empUpdateModal1 form").serialize(),//得到表单里面的值
            success:function(result){
            	alert(result);
                $("#empUpdateModal").modal("hide");
                window.location.reload();
            }
        });
    });

    laydate.render({
        elem: '#openTimeStart', //指定元素
        type: 'time'
    });

    laydate.render({
        elem: '#openTimeEnd', //指定元素
        type: 'time'
    });
    laydate.render({
        elem: '#openTimeStart1', //指定元素
        type: 'time'
    });

    laydate.render({
        elem: '#openTimeEnd1', //指定元素
        type: 'time'
    });
});
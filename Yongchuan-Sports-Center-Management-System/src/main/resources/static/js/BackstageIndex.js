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
    	var username = $(this).parent().parent().find("td:eq(1)").text();
    	$.ajax({
                url:"/DeleteUser/"+username,
				type:"GET",
				success:function (result) {
					alert(result);
					window.location.href = "/BackstageUserNormal?PageNum=1";
                }
		});
    });

    //查询数据库，将这个人的信息查询出来，填入到各个input标签中
    $(".edit").on("click",function(){
        var username = $(this).parent().parent().find("td:eq(1)").text();
        $.ajax({
            url:"/selectUser/"+username,
            type:"GET",
            success:function(result){
                console.log(result);
                $("#id").val(result.id);
                $("#username").val(result.username);
                $("#password").val(result.password);
                $("#idNumber").val(result.idNumber);
                $("#mobileNo").val(result.mobileNo);
                $("#accountType").val(result.accountType);
            }
        });

        $("#empUpdateModal").modal({
            backdrop:"static"
        });
    });

    //更新数据
    $("#update").click(function () {
        $.ajax({
            url:"/updateUser/",
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
    $("#add").on("click",function(){
        $("#empUpdateModal1").modal({
            backdrop:"static"
        });
	})

   //新增用户
    $("#addUser").click(function () {
        var formData = new FormData($("#empUpdateModal1 form")[0]);
        $.ajax({
            url:"/AddUserBoss/",
            type:"POST",
            data: formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
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
			url:"/DeleteUsers/"+users,
			type:"GET",
			success:function (result) {
			alert(result);
			window.location.href = "/BackstageUserNormal";
            }
		})
    });

});
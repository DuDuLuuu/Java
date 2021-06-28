// // ==UserScript==
// // @name         JDbScript4Bilibili
// // @namespace    http://tampermonkey.net/
// // @version      0.1
// // @description  try to take over the world!
// // @author       JDb
// // @compatible   chrome
// // @compatible   firefox
// // @include      *://www.bilibili.com/video/av*
// // @include      *://www.bilibili.com/video/BV*
// // @include      *://www.bilibili.com/bangumi/play/ep*
// // @include      *://www.bilibili.com/bangumi/play/ss*
// // @include      *://m.bilibili.com/bangumi/play/ep*
// // @include      *://m.bilibili.com/bangumi/play/ss*
// // @include      *://bangumi.bilibili.com/anime/*
// // @include      *://bangumi.bilibili.com/movie/*
// // @include      *://www.bilibili.com/bangumi/media/md*
// // @include      *://www.bilibili.com/blackboard/html5player.html*
// // @run-at       document-start
// // @require      http://cdn.bootcss.com/jquery/1.8.3/jquery.min.js
// // @grant        none
// // ==/UserScript==
// var 开关弹幕 = 80;//P
//         var 加 = 187;//=+
//         var 减 = 189;//-_
//         var 控制全屏 = 27;//ESC
//         var 网页全屏 = 79;//0
// // 键盘编码表  https://jingyan.baidu.com/article/fedf073780e16335ac8977a4.html
// // console    document.querySelector("video").playbackRate=
//         (function() {
//         'use strict';
//         window.onload = ()=>{
//         doTask();
//         }
//         })();
//         const sleep = ms => new Promise(resolve => setTimeout(resolve, ms));
//
//         async function doTask(){
// //    setInterval(function () {
// //      checkSpeed()
// //}, 2000);
//
//         checkSpeed()
//         jumpNext()
//         }
//
//         async function checkSpeed() {
//         var videoDom = document.querySelector("video")
//         //播放速度
//         var rate=2
//         if(videoDom.playbackRate==rate){
//         return
//         }
//         await sleep(500);
//         videoDom.playbackRate=rate
//         let barrage = $(".bilibili-player-video-danmaku-switch .bui-switch-dot");
//         //关闭弹幕
//         if(barrage.css("left") == "30px" || barrage.css("left") == "100%"){
//         $('.bui-switch-input').click();
//         }
//         }
//
//         function jumpNext(){
//         setInterval(function () {
//         let videoObj = document.querySelector("video:first-child");
//         let nextBtn = document.querySelector(".bilibili-player-iconfont-next");
//         if (nextBtn) {
//         let currentTime = videoObj.currentTime;
//         let totalTime = videoObj.duration;
//         if (totalTime - currentTime < 0.5) {
//         // 视频还剩500ms的时候自动跳转到下一个视频，防止出现充电界面
//         document.querySelector(".bilibili-player-iconfont-next").click();
//         }
//         }
//         }, 200);
//         }
//         function click_Full_screen(){
//         $("button[data-text='进入全屏']").click();
//         }
//         function click_Full_screen_page(){
//         $("button[data-text='网页全屏']").click();
//         }
//         function click_Barrage(){
//         $('.bui-switch-input').click();
//         }
//         function playback_rate_add(){
//         if(document.querySelector("video").playbackRate==2){
//         return
//         }
//         document.querySelector("video").playbackRate+=0.25
//         }
//         function playback_rate_sub(){
//         if(document.querySelector("video").playbackRate==1){
//         return
//         }
//         document.querySelector("video").playbackRate-=0.25
//         }
//
//         $(document).ready(function() {
//         //调用键盘编码，按了键盘回调keydown里的function(event)函数，event就是你按的那个按键的code码
//         $(document).keydown(function(event){
//         switch(event.keyCode){
//         case 开关弹幕:
//         click_Barrage();
//         break;
//         case 控制全屏:
//         click_Full_screen();
//         break;
//         case 网页全屏:
//         click_Full_screen_page();
//         break;
//         case 加:
//         playback_rate_add();
//         break;
//         case 减:
//         playback_rate_sub();
//         break;
//         }
//         });
//         });
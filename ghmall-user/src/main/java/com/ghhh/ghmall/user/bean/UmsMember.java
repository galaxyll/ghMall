package com.ghhh.ghmall.user.bean;

/**
 * @author galaxy
 * @date 19-8-13 - 下午4:32
 */
public class UmsMember {

    private Intid bigint(20),
  `member_level_id` bigint(20) ,
  `username` varchar(64) ,
            `nickname` varchar(64) ,
            `phone` varchar(64) ,
            `status` int(1) ,
            `create_time` datetime ,
            `icon` varchar(500) ,
            `gender` int(1) ,
            `password` varchar(64),
            `birthday` date ,
            `city` varchar(64) ,
            `job` varchar(100) ,
            `personalized_signature` varchar(200) ,
            `source_type` int(1) ,
            `integration` int(11),
            `growth` int(11) ,
            `luckey_count` int(11),
            `history_integration` int(11),
}

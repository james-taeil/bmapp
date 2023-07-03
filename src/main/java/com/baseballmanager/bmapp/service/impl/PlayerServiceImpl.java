package com.baseballmanager.bmapp.service.impl;

import com.baseballmanager.bmapp.model.Player;
import com.baseballmanager.bmapp.service.PlayerService;



public class PlayerServiceImpl implements PlayerService {
    public void example() {
        final Player player = Player.builder()
                .name("박민기")
                .position("포수")
                .build();

        // 팀추가
        player.enrollTeam(1);
        System.out.println(player);
    }


    public void updatePlayer() {
        System.out.println();
    }
}

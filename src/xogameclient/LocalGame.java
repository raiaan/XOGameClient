/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;

/**
 *
 * @author ahmed
 */
public class LocalGame extends Game{
    public LocalGame(String playerNameA,String playerNameB){
        playerA =new Player(playerNameA);
        playerB=new Player(playerNameB);
    }
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apuntesdejava.websocket;
import javax.websocket.server.ServerEndpointConfig;



/**
 *
 * @author LuzMary
 */
public class WebSocketConfig extends ServerEndpointConfig.Configurator  {
    //private static BroadcastUsuariosEndPoint websocketconf = new BroadcastUsuariosEndPoint();
    
    @Override
    public <T> T getEndpointInstance(Class <T> endpointClass) throws InstantiationException
    {
        if (BroadcastUsuariosEndPoint.class.equals(endpointClass)) {
            return (T)new BroadcastUsuariosEndPoint();
        }else
        {
        throw new InstantiationException();
        }       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pandev.modularbot.modules.chatModules;

import com.pandev.modularbot.modules.chatModule;
import com.pandev.modularbot.modules.module;
import com.pandev.modularbot.modules.moduleConfig;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

/**
 *
 * @author PandaBoy444
 */
public class issueModules extends Plugin {

    public issueModules(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Extension
    public static class issueAdder implements chatModule {

        @Override
        public void onMessageReceived(MessageReceivedEvent event) {
        }

        @Override
        public module loadModule(moduleConfig cfg) {
            System.err.println(this.getClass().getSimpleName());
            //
            //
            return this;
        }

    }

}

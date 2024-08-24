package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //need to identify the admin

        ModulesDto channelScreen = new ModulesDto("ChannelScreen",true,"admin",true);
        ModulesDto chatScreen = new ModulesDto("ChatScreen",false,"admin",true);
        ModulesDto contactScreen = new ModulesDto("ContactScreen",true,"admin",true);
        ModulesDto historyScreen = new ModulesDto("HistoryScreen",false,"admin",true);


        List<ModulesDto> modules = new ArrayList<>();
        modules.add(channelScreen);
        modules.add(chatScreen);
        modules.add(contactScreen);
        modules.add(historyScreen);

        // need to enable the module and sub module based on the user admin

        Admin admin = new Admin(modules);

        admin.showModule();

        // check the sub module is enabled or not



        for (ModulesDto modulesDto:modules) {


            if (modulesDto.getUser().equalsIgnoreCase("admin")) {

                //enabling the module
                if(!modulesDto.isEnabled()) {
                    admin.toggleModules(modulesDto.getName(), true);
                }
                //disabling the module
                else {
                    admin.toggleModules(modulesDto.getName(),false);
                }
            }else {
                System.out.println("The User is Not a Admin");
            }
        }
        System.out.println("----------");
        admin.showModule();

    }
}

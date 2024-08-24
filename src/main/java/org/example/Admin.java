package org.example;

import java.util.List;

public class Admin {
        //create a admin class - created
        //create a module options - Dto created
        //validate the admin
    public List<ModulesDto> modules;

    public Admin (List<ModulesDto> modules){
        this.modules=modules;
    }

    public void toggleModules(String moduleName,boolean enabled){
        for(ModulesDto module:modules){
            if(module.getName().equalsIgnoreCase(moduleName)){
                module.setEnabled(enabled);
                module.setSubModule(enabled);
                return;
            }
        }
    }

    public void showModule(){
        int val ;
        for (ModulesDto modules:modules){
            if (modules.isEnabled()){
                val=1;
            }else {val=0;}
            System.out.println("Screen Name:: "+modules.getName()+" "+"User:: "+modules.getUser()+" "+"Module Status:: "+modules.isEnabled+" SubModule Status:: "+modules.isSubModule);
        }
    }




}
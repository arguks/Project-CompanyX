
package com.krisstelargueta.project_companyx;

public class Orders {

    private final int priority;
    private final String client;
    private final boolean isBulk;
    private final boolean rushProcessing;
    private final boolean knowsSomeone;
    
    public Orders (String client, boolean isBulk, boolean rushProcessing, boolean knowsSomeone){
        this.client = client;
        this.isBulk = isBulk;
        this.knowsSomeone = knowsSomeone;
        this.rushProcessing = rushProcessing;
        
        if(knowsSomeone){priority = 1;}
        else if(isBulk){priority = 2;}
        else if(rushProcessing){priority = 3;}
        else{priority = 4;}
    }
    
    public int getPriority (){
        return priority;
    }
    
    public String getClient (){
        return client;
    }
    
}

package org.kevoree.proto.models15.server;

import org.kevoree.modeling.api.Callback;

/**
 * Created by gregory.nain on 10/11/14.
 */
public class Utils {

    public static Callback<Throwable> DefaultPrintStackTraceCallback = err->{
        if(err != null) {
            err.printStackTrace();
        }
    };


}

package org.o26.sf.oca.exam;

import static java.lang.System.*;
/**
 * Created by O26 on 24/02/2016.
 */
public class _ {
    private String[] __A_V_ = null;

    public _(String[] __A_V_) {
        this.__A_V_ = __A_V_;
    }

    public void doLoop(){
        String $ = "";
        for(int x=0; ++x < __A_V_.length; ) // for loop
            $ += __A_V_[x];
        out.println($);
    }
}

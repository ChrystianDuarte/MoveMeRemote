/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.moveme.servicelocator.delegate;


import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.cl.moveme.servicelocator.facade.*;
/**
 *
 * @author fito
 */
public class GnosisLifeLookupService {

    public Object localizarFachada(String fachada) {
        Object retorno = null;
        retorno = null;
        try {
            Properties props = new Properties();
            props.setProperty("java.naming.factory.initial",
                    "com.sun.enterprise.naming.SerialInitContextFactory");

            props.setProperty("java.naming.factory.url.pkgs",
                    "com.sun.enterprise.naming");

            props.setProperty("java.naming.factory.state","com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            // optional.  Defaults to localhost.  Only needed if web server is running
            // on a different host than the appserver
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");

            // optional.  Defaults to 3700.  Only needed if target orb port is not 3700.
            props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

            InitialContext ic = new InitialContext(props);

            if (fachada != null) {
            } else {
                retorno = (GnosisLifeFacadeRemote) ic.lookup("com.cl.moveme.servicelocator.facade.GnosisLifeFacadeRemote");
            }
        } catch (NamingException ex) {
            ex.printStackTrace();
        }

        return retorno;
    }
}

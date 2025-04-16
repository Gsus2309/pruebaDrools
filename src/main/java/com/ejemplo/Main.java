
package com.ejemplo;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {
    public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession();

        Persona p1 = new Persona("Carlos", 16);
        Persona p2 = new Persona("Ana", 22);

        ksession.insert(p1);
        ksession.insert(p2);

        ksession.fireAllRules();
        ksession.dispose();

        System.out.println(p1);
        System.out.println(p2);
    }
}

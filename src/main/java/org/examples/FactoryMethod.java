package org.examples;

import java.lang.reflect.Method;

public class FactoryMethod {

    private static FactoryMethod instance = new FactoryMethod();

    private FactoryMethod() {
    }

    public static FactoryMethod getInstance() {
        return instance;
    }

    public IFabricaAbstrata obterFabrica(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.examples.Fabrica" + tipo);
            Method getInstanceMethod = classe.getMethod("getInstance");
            objeto = getInstanceMethod.invoke(null);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fabrica inexistente");
        }
        if (!(objeto instanceof IFabricaAbstrata)) {
            throw new IllegalArgumentException("Fabrica inválida");
        }
        return (IFabricaAbstrata) objeto;
    }
}
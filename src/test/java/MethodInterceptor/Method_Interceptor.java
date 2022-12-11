package MethodInterceptor;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import org.testng.internal.MethodInstance;

import java.util.*;

public class Method_Interceptor implements IMethodInterceptor {
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> list, ITestContext context) {
    List<IMethodInstance> resultset= new ArrayList<>();
        for(IMethodInstance methodInstance:list){
           Test annotation=   methodInstance.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
           if(annotation.priority()==2) resultset.add(0,methodInstance);
           else resultset.add(methodInstance);

           /* HashSet<String>groups= new HashSet<>();
            for(String group:annotation.groups()){
                groups.add(group);
            }
            if(groups.contains("Regression"))
            resultset.add(0, methodInstance);
            else resultset.add(methodInstance);*/
        }
        return resultset;
    }
}

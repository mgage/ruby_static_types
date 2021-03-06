/* THIS FILE IS GENERATED. DO NOT EDIT */
package org.jruby.gen;
import org.jruby.Ruby;
import org.jruby.RubyModule;
import org.jruby.RubyClass;
import org.jruby.CompatVersion;
import org.jruby.anno.TypePopulator;
import org.jruby.internal.runtime.methods.CallConfiguration;
import org.jruby.internal.runtime.methods.JavaMethod;
import org.jruby.internal.runtime.methods.DynamicMethod;
import org.jruby.runtime.Arity;
import org.jruby.runtime.Visibility;
import org.jruby.compiler.ASTInspector;
import java.util.Arrays;
import java.util.List;
public class org$jruby$java$proxies$JavaProxy$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$s$0$0$singleton_class(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "singleton_class", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "singleton_class", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("singleton_class", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$s$0$0$op_aref(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "op_aref", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "op_aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$s$0$0$field_accessor(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "field_accessor", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "field_accessor", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("field_accessor", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$s$1$0$inherited(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "inherited", true, CallConfiguration.FrameFullScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "inherited", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("inherited", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$s$0$0$field_writer(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "field_writer", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "field_writer", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("field_writer", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$s$0$0$persistent(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "persistent", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "persistent", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("__persistent__", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$s$0$0$field_reader(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "field_reader", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "field_reader", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("field_reader", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$s$1$0$persistent(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "persistent", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "persistent", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("__persistent__=", javaMethod);
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","singleton_class","singleton_class");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","op_aref","[]");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","field_accessor","field_accessor");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","inherited","inherited");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","field_writer","field_writer");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","persistent","__persistent__");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","field_reader","field_reader");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","persistent","__persistent__=");
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$i$java_method(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "java_method", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "java_method", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("java_method", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$i$1$0$equal_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "equal_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "equal_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("equal?", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$i$1$0$marshal_load(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "marshal_load", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "marshal_load", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("marshal_load", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$i$java_send(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "java_send", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "java_send", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("java_send", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaProxy$INVOKER$i$0$0$marshal_dump(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "marshal_dump", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaProxy.class, "marshal_dump", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("marshal_dump", javaMethod);
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","java_method","java_method");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","equal_p","equal?");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","marshal_load","marshal_load");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","java_send","java_send");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaProxy","marshal_dump","marshal_dump");
    }
    static {
     }
}

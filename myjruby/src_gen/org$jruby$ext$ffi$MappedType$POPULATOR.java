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
public class org$jruby$ext$ffi$MappedType$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.MappedType$INVOKER$s$1$0$newMappedType(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "newMappedType", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MappedType.class, "newMappedType", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.MappedType","newMappedType","new");
        javaMethod = new org.jruby.ext.ffi.MappedType$INVOKER$i$2$0$to_native(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "to_native", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MappedType.class, "to_native", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_native", javaMethod);
        javaMethod = new org.jruby.ext.ffi.MappedType$INVOKER$i$2$0$from_native(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "from_native", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MappedType.class, "from_native", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("from_native", javaMethod);
        javaMethod = new org.jruby.ext.ffi.MappedType$INVOKER$i$0$0$native_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "native_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MappedType.class, "native_type", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("native_type", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.MappedType","to_native","to_native");
        runtime.addBoundMethod("org.jruby.ext.ffi.MappedType","from_native","from_native");
        runtime.addBoundMethod("org.jruby.ext.ffi.MappedType","native_type","native_type");
    }
    static {
     }
}

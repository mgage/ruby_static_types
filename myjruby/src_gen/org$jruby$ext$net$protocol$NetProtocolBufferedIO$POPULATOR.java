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
public class org$jruby$ext$net$protocol$NetProtocolBufferedIO$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.net.protocol.NetProtocolBufferedIO$INVOKER$s$1$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.net.protocol.NetProtocolBufferedIO.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.net.protocol.NetProtocolBufferedIO","initialize","initialize");
    }
    static {
     }
}

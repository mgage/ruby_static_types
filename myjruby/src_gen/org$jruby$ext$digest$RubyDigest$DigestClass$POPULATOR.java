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
public class org$jruby$ext$digest$RubyDigest$DigestClass$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.digest.RubyDigest$DigestClass$INVOKER$s$0$0$s_digest(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "s_digest", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.digest.RubyDigest.DigestClass.class, "s_digest", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("digest", javaMethod);
        javaMethod = new org.jruby.ext.digest.RubyDigest$DigestClass$INVOKER$s$0$1$s_hexdigest(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "s_hexdigest", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.digest.RubyDigest.DigestClass.class, "s_hexdigest", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("hexdigest", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.digest.RubyDigest.DigestClass","s_digest","digest");
        runtime.addBoundMethod("org.jruby.ext.digest.RubyDigest.DigestClass","s_hexdigest","hexdigest");
    }
    static {
     }
}

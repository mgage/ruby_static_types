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
public class org$jruby$RubyEnumerator$RubyEnumeratorKernel$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyEnumerator$RubyEnumeratorKernel$INVOKER$s$obj_to_enum(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "obj_to_enum", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.RubyEnumeratorKernel.class, "obj_to_enum", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_enum", javaMethod);
        cls.addMethodAtBootTimeOnly("enum_for", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEnumerator.RubyEnumeratorKernel","obj_to_enum","to_enum");
    }
    static {
     }
}

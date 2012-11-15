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
public class org$jruby$RubyProcess$RubyStatus$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$exited(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "exited", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "exited", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("exited?", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$1$0$not_implemented1(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "not_implemented1", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "not_implemented1", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("&", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$termsig(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "termsig", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "termsig", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("termsig", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$stopsig(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "stopsig", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "stopsig", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("stopsig", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$not_implemented0(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "not_implemented0", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "not_implemented0", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("stopped?", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$signaled(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "signaled", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "signaled", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("signaled?", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$not_implemented(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "not_implemented", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "not_implemented", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_int", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$pid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "pid", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "pid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("pid", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$1$0$op_rshift(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_rshift", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "op_rshift", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly(">>", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$to_i(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_i", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "to_i", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_i", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$coredump_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "coredump_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "coredump_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("coredump?", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$exitstatus(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "exitstatus", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "exitstatus", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("exitstatus", javaMethod);
        javaMethod = new org.jruby.RubyProcess$RubyStatus$INVOKER$i$0$0$success_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "success_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.RubyStatus.class, "success_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("success?", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","exited","exited?");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","not_implemented1","&");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","termsig","termsig");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","inspect","inspect");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","stopsig","stopsig");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","not_implemented0","stopped?");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","signaled","signaled?");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","to_s","to_s");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","not_implemented","to_int");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","pid","pid");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","op_rshift",">>");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","op_equal","==");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","to_i","to_i");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","coredump_p","coredump?");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","exitstatus","exitstatus");
        runtime.addBoundMethod("org.jruby.RubyProcess.RubyStatus","success_p","success?");
    }
    static {
     }
}
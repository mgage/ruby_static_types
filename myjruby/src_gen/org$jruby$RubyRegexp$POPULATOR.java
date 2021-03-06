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
public class org$jruby$RubyRegexp$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyRegexp$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "newInstance", org.jruby.RubyRegexp.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("compile", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$s$last_match_s(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "last_match_s", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "last_match_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("last_match", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyRegexp","newInstance","new");
        runtime.addBoundMethod("org.jruby.RubyRegexp","last_match_s","last_match");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyRegexp$INVOKER$s$0$1$quote(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "quote", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "quote", org.jruby.RubyString.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("quote", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("escape", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$s$0$0$union(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "union", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "union", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("union", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyRegexp","quote","quote");
        runtime.addBoundMethod("org.jruby.RubyRegexp","union","union");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyRegexp$INVOKER$s$1$0$quote19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "quote19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "quote19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("quote", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("escape", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$s$0$0$union19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "union19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "union19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("union", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$s$1$0$try_convert(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "try_convert", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "try_convert", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("try_convert", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyRegexp","quote19","quote");
        runtime.addBoundMethod("org.jruby.RubyRegexp","union19","union");
        runtime.addBoundMethod("org.jruby.RubyRegexp","try_convert","try_convert");
        }
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$casefold_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "casefold_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "casefold_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("casefold?", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$source(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "source", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "source", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("source", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hash", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "hash", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("hash", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$1$0$initialize_copy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$options(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "options", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "options", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("options", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyRegexp","casefold_p","casefold?");
        runtime.addBoundMethod("org.jruby.RubyRegexp","source","source");
        runtime.addBoundMethod("org.jruby.RubyRegexp","op_equal","==");
        runtime.addBoundMethod("org.jruby.RubyRegexp","hash","hash");
        runtime.addBoundMethod("org.jruby.RubyRegexp","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.RubyRegexp","to_s","to_s");
        runtime.addBoundMethod("org.jruby.RubyRegexp","options","options");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$1$0$op_match(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_match", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "op_match", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("=~", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$1$0$eqq(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "eqq", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "eqq", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("===", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$op_match2(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "op_match2", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "op_match2", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("~", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$1$0$match_m(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "match_m", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "match_m", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("match", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$kcode(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "kcode", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "kcode", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("kcode", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$initialize_m(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize_m", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "initialize_m", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyRegexp","op_match","=~");
        runtime.addBoundMethod("org.jruby.RubyRegexp","eqq","===");
        runtime.addBoundMethod("org.jruby.RubyRegexp","op_match2","~");
        runtime.addBoundMethod("org.jruby.RubyRegexp","match_m","match");
        runtime.addBoundMethod("org.jruby.RubyRegexp","kcode","kcode");
        runtime.addBoundMethod("org.jruby.RubyRegexp","inspect","inspect");
        runtime.addBoundMethod("org.jruby.RubyRegexp","initialize_m","initialize");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$1$0$op_match19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_match19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "op_match19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("=~", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$named_captures(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "named_captures", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "named_captures", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("named_captures", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$1$0$eqq19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "eqq19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "eqq19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("===", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$fixed_encoding_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "fixed_encoding_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "fixed_encoding_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("fixed_encoding?", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$names(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "names", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "names", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("names", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$encoding(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "encoding", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "encoding", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("encoding", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$op_match2_19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "op_match2_19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "op_match2_19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("~", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$match_m19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "match_m19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "match_m19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("match", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$0$0$inspect19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "inspect19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyRegexp$INVOKER$i$initialize_m19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize_m19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRegexp.class, "initialize_m19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyRegexp","op_match19","=~");
        runtime.addBoundMethod("org.jruby.RubyRegexp","named_captures","named_captures");
        runtime.addBoundMethod("org.jruby.RubyRegexp","eqq19","===");
        runtime.addBoundMethod("org.jruby.RubyRegexp","fixed_encoding_p","fixed_encoding?");
        runtime.addBoundMethod("org.jruby.RubyRegexp","names","names");
        runtime.addBoundMethod("org.jruby.RubyRegexp","encoding","encoding");
        runtime.addBoundMethod("org.jruby.RubyRegexp","op_match2_19","~");
        runtime.addBoundMethod("org.jruby.RubyRegexp","match_m19","match");
        runtime.addBoundMethod("org.jruby.RubyRegexp","inspect19","inspect");
        runtime.addBoundMethod("org.jruby.RubyRegexp","initialize_m19","initialize");
        }
    }
    static {
        ASTInspector.addScopeAwareMethods("=~","===","~","last_match","match");
     }
}

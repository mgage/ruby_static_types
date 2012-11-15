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
public class org$jruby$RubyBignum$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$0$0$to_f(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_f", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "to_f", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_f", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_aref", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_aref", org.jruby.RubyFixnum.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$0$0$op_uminus(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "op_uminus", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_uminus", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("-@", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$coerce(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "coerce", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "coerce", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("coerce", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$0$0$hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hash", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "hash", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("hash", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_mul(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_mul", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_mul", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("*", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_idiv(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_idiv", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_idiv", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("div", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_plus(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_plus", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_plus", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("+", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_div(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_div", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_div", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("/", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$0$0$size(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "size", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "size", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_cmp(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_cmp", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_cmp", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<=>", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_minus(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_minus", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_minus", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("-", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$0$0$abs(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "abs", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "abs", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("abs", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_rshift(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_rshift", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_rshift", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly(">>", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_lshift(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_lshift", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_lshift", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$0$0$op_neg(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "op_neg", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_neg", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("~", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$eql_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "eql_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "eql_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        cls.addMethodAtBootTimeOnly("===", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_pow(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_pow", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_pow", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("**", javaMethod);
        cls.addMethodAtBootTimeOnly("power", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyBignum","to_f","to_f");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_aref","[]");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_uminus","-@");
        runtime.addBoundMethod("org.jruby.RubyBignum","coerce","coerce");
        runtime.addBoundMethod("org.jruby.RubyBignum","hash","hash");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_mul","*");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_idiv","div");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_plus","+");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_div","/");
        runtime.addBoundMethod("org.jruby.RubyBignum","size","size");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_cmp","<=>");
        runtime.addBoundMethod("org.jruby.RubyBignum","to_s","to_s");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_minus","-");
        runtime.addBoundMethod("org.jruby.RubyBignum","abs","abs");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_rshift",">>");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_equal","==");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_lshift","<<");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_neg","~");
        runtime.addBoundMethod("org.jruby.RubyBignum","eql_p","eql?");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_pow","**");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$quo(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "quo", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "quo", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("quo", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$remainder(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "remainder", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "remainder", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("remainder", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_and(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_and", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_and", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("&", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$divmod(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "divmod", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "divmod", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("divmod", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_mod(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_mod", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_mod", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("%", javaMethod);
        cls.addMethodAtBootTimeOnly("modulo", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_xor(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_xor", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_xor", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("^", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_or(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_or", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_or", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("|", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyBignum","quo","quo");
        runtime.addBoundMethod("org.jruby.RubyBignum","remainder","remainder");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_and","&");
        runtime.addBoundMethod("org.jruby.RubyBignum","divmod","divmod");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_mod","%");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_xor","^");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_or","|");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$quo19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "quo19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "quo19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("quo", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$remainder19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "remainder19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "remainder19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("remainder", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_and19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_and19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_and19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("&", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$divmod19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "divmod19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "divmod19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("divmod", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_mod19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_mod19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_mod19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("%", javaMethod);
        cls.addMethodAtBootTimeOnly("modulo", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_mul19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_mul19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_mul19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("*", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_xor19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_xor19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_xor19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("^", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_or19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_or19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_or19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("|", javaMethod);
        javaMethod = new org.jruby.RubyBignum$INVOKER$i$1$0$op_pow19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_pow19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBignum.class, "op_pow19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("**", javaMethod);
        cls.addMethodAtBootTimeOnly("power", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyBignum","quo19","quo");
        runtime.addBoundMethod("org.jruby.RubyBignum","remainder19","remainder");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_and19","&");
        runtime.addBoundMethod("org.jruby.RubyBignum","divmod19","divmod");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_mod19","%");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_mul19","*");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_xor19","^");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_or19","|");
        runtime.addBoundMethod("org.jruby.RubyBignum","op_pow19","**");
        }
    }
    static {
     }
}
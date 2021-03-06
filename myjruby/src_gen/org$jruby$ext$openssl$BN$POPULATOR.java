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
public class org$jruby$ext$openssl$BN$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$s$1$0$bn_pseudo_rand_range(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_pseudo_rand_range", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_pseudo_rand_range", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("pseudo_rand_range", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$s$1$0$bn_rand_range(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_rand_range", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_rand_range", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("rand_range", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$s$0$0$bn_pseudo_rand(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "bn_pseudo_rand", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_pseudo_rand", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("pseudo_rand", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$s$0$0$bn_generate_prime(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "bn_generate_prime", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_generate_prime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("generate_prime", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$s$0$0$bn_rand(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "bn_rand", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_rand", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("rand", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_pseudo_rand_range","pseudo_rand_range");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_rand_range","rand_range");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_pseudo_rand","pseudo_rand");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_generate_prime","generate_prime");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_rand","rand");
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_num_bits(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bn_num_bits", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_num_bits", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("num_bits", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$2$0$bn_mod_add(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "bn_mod_add", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_mod_add", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("mod_add", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_ucmp(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_ucmp", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_ucmp", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("ucmp", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_to_bn(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bn_to_bn", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_to_bn", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_bn", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_to_i(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bn_to_i", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_to_i", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_i", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_is_odd(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bn_is_odd", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_is_odd", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("odd?", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_is_prime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "bn_is_prime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_is_prime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("prime?", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_cmp(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_cmp", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_cmp", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("cmp", javaMethod);
        cls.addMethodAtBootTimeOnly("<=>", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "bn_to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_mod_inverse(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_mod_inverse", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_mod_inverse", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("mod_inverse", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$2$0$bn_mod_mul(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "bn_mod_mul", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_mod_mul", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("mod_mul", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_mask_bits(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_mask_bits", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_mask_bits", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("mask_bits!", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$2$0$bn_mod_exp(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "bn_mod_exp", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_mod_exp", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("mod_exp", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_xor(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_xor", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_xor", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("^", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_exp(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_exp", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_exp", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("**", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_copy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("copy", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$1$bn_initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "bn_initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_num_bits_set(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bn_num_bits_set", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_num_bits_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("num_bits_set", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_coerce(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_coerce", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_coerce", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("coerce", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_and(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_and", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_and", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("&", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$2$0$bn_mod_sub(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "bn_mod_sub", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_mod_sub", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("mod_sub", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_clear_bit(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_clear_bit", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_clear_bit", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("clear_bit!", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_mod(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_mod", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_mod", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("%", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_sqr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bn_sqr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_sqr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("sqr", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_mul(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_mul", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_mul", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("*", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_add(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_add", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_add", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("+", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_is_zero(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bn_is_zero", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_is_zero", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("zero?", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_div(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_div", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_div", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("/", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_num_bytes(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bn_num_bytes", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_num_bytes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("num_bytes", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_sub(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_sub", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_sub", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("-", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_rshift(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_rshift", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_rshift", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly(">>", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_set_bit(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_set_bit", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_set_bit", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("set_bit!", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_lshift(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_lshift", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_lshift", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_not(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bn_not", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_not", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("~", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_mod_sqr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_mod_sqr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_mod_sqr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("mod_sqr", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_is_bit_set(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_is_bit_set", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_is_bit_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("bit_set?", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_or(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_or", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_or", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("|", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_is_prime_fasttest(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "bn_is_prime_fasttest", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_is_prime_fasttest", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("prime_fasttest?", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_eql(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_eql", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_eql", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        cls.addMethodAtBootTimeOnly("===", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$0$0$bn_is_one(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bn_is_one", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_is_one", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("one?", javaMethod);
        javaMethod = new org.jruby.ext.openssl.BN$INVOKER$i$1$0$bn_gcd(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bn_gcd", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.BN.class, "bn_gcd", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("gcd", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_num_bits","num_bits");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_mod_add","mod_add");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_ucmp","ucmp");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_to_bn","to_bn");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_to_i","to_i");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_is_odd","odd?");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_is_prime","prime?");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_cmp","cmp");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_to_s","to_s");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_mod_inverse","mod_inverse");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_mod_mul","mod_mul");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_mask_bits","mask_bits!");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_mod_exp","mod_exp");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_xor","^");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_exp","**");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_copy","copy");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_num_bits_set","num_bits_set");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_coerce","coerce");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_and","&");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_mod_sub","mod_sub");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_clear_bit","clear_bit!");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_mod","%");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_sqr","sqr");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_mul","*");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_add","+");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_is_zero","zero?");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_div","/");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_num_bytes","num_bytes");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_sub","-");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_rshift",">>");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_set_bit","set_bit!");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_lshift","<<");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_not","~");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_mod_sqr","mod_sqr");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_is_bit_set","bit_set?");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_or","|");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_is_prime_fasttest","prime_fasttest?");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_eql","eql?");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_is_one","one?");
        runtime.addBoundMethod("org.jruby.ext.openssl.BN","bn_gcd","gcd");
    }
    static {
     }
}

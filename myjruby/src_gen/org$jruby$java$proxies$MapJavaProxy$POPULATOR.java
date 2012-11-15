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
public class org$jruby$java$proxies$MapJavaProxy$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$to_hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_hash", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "to_hash", org.jruby.RubyHash.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_hash", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$op_aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_aref", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "op_aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$reject(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "reject", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "reject", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("reject", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$sort(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "sort", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "sort", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("sort", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$merge(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "merge", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "merge", org.jruby.RubyHash.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("merge", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$reject_bang(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "reject_bang", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "reject_bang", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("reject!", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$values_at(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "values_at", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "values_at", org.jruby.RubyArray.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("values_at", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$invert(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "invert", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "invert", org.jruby.RubyHash.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("invert", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$rb_clear(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rb_clear", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "rb_clear", org.jruby.RubyHash.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("clear", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$rb_values(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rb_values", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "rb_values", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("values", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$each_value(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each_value", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "each_value", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_value", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$default_value_set(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "default_value_set", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "default_value_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("default=", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$delete(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "delete", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "delete", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("delete", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$delete_if(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "delete_if", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "delete_if", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("delete_if", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$each_pair(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each_pair", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "each_pair", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_pair", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$each_key(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each_key", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "each_key", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_key", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$1$fetch(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fetch", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "fetch", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("fetch", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$empty_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "empty_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "empty_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("empty?", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$has_key_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "has_key_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "has_key_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("has_key?", javaMethod);
        cls.addMethodAtBootTimeOnly("key?", javaMethod);
        cls.addMethodAtBootTimeOnly("include?", javaMethod);
        cls.addMethodAtBootTimeOnly("member?", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$keys(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "keys", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "keys", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("keys", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$select(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "select", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "select", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("select", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$indices(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "indices", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "indices", org.jruby.RubyArray.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("indexes", javaMethod);
        cls.addMethodAtBootTimeOnly("indices", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$has_value_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "has_value_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "has_value_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("has_value?", javaMethod);
        cls.addMethodAtBootTimeOnly("value?", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$rb_size(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rb_size", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "rb_size", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        cls.addMethodAtBootTimeOnly("length", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$default_value_get(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "default_value_get", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "default_value_get", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("default", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$rehash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rehash", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "rehash", org.jruby.RubyHash.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("rehash", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$op_eql19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_eql19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "op_eql19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$to_a(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_a", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "to_a", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_a", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$default_proc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "default_proc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "default_proc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("default_proc", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$shift(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "shift", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "shift", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("shift", javaMethod);
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","to_hash","to_hash");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","op_aref","[]");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","reject","reject");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","sort","sort");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","merge","merge");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","reject_bang","reject!");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","values_at","values_at");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","to_s","to_s");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","invert","invert");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","rb_clear","clear");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","rb_values","values");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","op_equal","==");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","each_value","each_value");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","default_value_set","default=");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","delete","delete");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","delete_if","delete_if");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","each_pair","each_pair");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","each_key","each_key");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","fetch","fetch");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","empty_p","empty?");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","has_key_p","has_key?");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","keys","keys");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","select","select");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","indices","indexes");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","has_value_p","has_value?");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","rb_size","size");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","default_value_get","default");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","rehash","rehash");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","op_eql19","eql?");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","to_a","to_a");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","inspect","inspect");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","default_proc","default_proc");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","shift","shift");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$replace(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "replace", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "replace", org.jruby.RubyHash.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("replace", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$index(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "index", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "index", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("index", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$merge_bang(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "merge_bang", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "merge_bang", org.jruby.RubyHash.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("merge!", javaMethod);
        cls.addMethodAtBootTimeOnly("update", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hash", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "hash", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("hash", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$each(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "each", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$initialize_copy(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "initialize_copy", org.jruby.RubyHash.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$2$0$op_aset(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "op_aset", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "op_aset", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]=", javaMethod);
        cls.addMethodAtBootTimeOnly("store", javaMethod);
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","replace","replace");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","index","index");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","merge_bang","merge!");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","hash","hash");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","each","each");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","op_aset","[]=");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$assoc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "assoc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "assoc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("assoc", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$index19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "index19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "index19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("index", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$merge_bang19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "merge_bang19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "merge_bang19", org.jruby.RubyHash.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("merge!", javaMethod);
        cls.addMethodAtBootTimeOnly("update", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$hash19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hash19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "hash19", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("hash", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$select19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "select19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "select19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("select", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$initialize_copy19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize_copy19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "initialize_copy19", org.jruby.RubyHash.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$to_s19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "to_s19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$replace19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "replace19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "replace19", org.jruby.RubyHash.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("replace", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$flatten(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "flatten", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "flatten", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("flatten", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$select_bang(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "select_bang", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "select_bang", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("select!", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$getCompareByIdentity_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getCompareByIdentity_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "getCompareByIdentity_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("compare_by_identity?", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$rassoc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "rassoc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "rassoc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("rassoc", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$each19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "each19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$keep_if(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "keep_if", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "keep_if", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("keep_if", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$set_default_proc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_default_proc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "set_default_proc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("default_proc=", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$0$0$getCompareByIdentity(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getCompareByIdentity", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "getCompareByIdentity", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("compare_by_identity", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$1$0$key(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "key", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "key", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("key", javaMethod);
        javaMethod = new org.jruby.java.proxies.MapJavaProxy$INVOKER$i$2$0$op_aset19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "op_aset19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.MapJavaProxy.class, "op_aset19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]=", javaMethod);
        cls.addMethodAtBootTimeOnly("store", javaMethod);
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","assoc","assoc");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","index19","index");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","merge_bang19","merge!");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","hash19","hash");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","select19","select");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","initialize_copy19","initialize_copy");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","to_s19","to_s");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","replace19","replace");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","flatten","flatten");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","select_bang","select!");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","getCompareByIdentity_p","compare_by_identity?");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","rassoc","rassoc");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","each19","each");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","keep_if","keep_if");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","set_default_proc","default_proc=");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","getCompareByIdentity","compare_by_identity");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","key","key");
        runtime.addBoundMethod("org.jruby.java.proxies.MapJavaProxy","op_aset19","[]=");
        }
    }
    static {
     }
}
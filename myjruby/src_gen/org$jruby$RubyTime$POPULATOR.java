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
public class org$jruby$RubyTime$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyTime$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("now", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$s$1$0$load(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "load", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "load", org.jruby.RubyTime.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("_load", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$s$0$9$new_utc(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "new_utc", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "new_utc", org.jruby.RubyTime.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("utc", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("gm", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$s$at(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "at", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "at", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("at", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$s$0$9$new_local(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "new_local", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "new_local", org.jruby.RubyTime.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("local", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("mktime", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyTime","newInstance","now");
        runtime.addBoundMethod("org.jruby.RubyTime","load","_load");
        runtime.addBoundMethod("org.jruby.RubyTime","new_utc","utc");
        runtime.addBoundMethod("org.jruby.RubyTime","at","at");
        runtime.addBoundMethod("org.jruby.RubyTime","new_local","local");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyTime$INVOKER$s$0$0$times(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "times", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "times", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("times", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyTime","times","times");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyTime$INVOKER$s$0$7$new19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "new19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "new19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyTime","new19","new");
        }
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$getlocal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getlocal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "getlocal", org.jruby.RubyTime.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("getlocal", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$to_f(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_f", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "to_f", org.jruby.RubyFloat.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_f", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_eqq(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_eqq", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_eqq", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("===", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$asctime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "asctime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "asctime", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("asctime", javaMethod);
        cls.addMethodAtBootTimeOnly("ctime", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$wday(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "wday", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "wday", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("wday", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$to_i(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_i", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "to_i", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_i", javaMethod);
        cls.addMethodAtBootTimeOnly("tv_sec", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_ge(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_ge", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_ge", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly(">=", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$usec(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "usec", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "usec", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("usec", javaMethod);
        cls.addMethodAtBootTimeOnly("tv_usec", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_cmp(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_cmp", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_cmp", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<=>", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$1$dump(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "dump", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "dump", org.jruby.RubyString.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("_dump", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$year(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "year", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "year", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("year", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$strftime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "strftime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "strftime", org.jruby.RubyString.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("strftime", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$min(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "min", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "min", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("min", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$localtime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "localtime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "localtime", org.jruby.RubyTime.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("localtime", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$succ(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "succ", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "succ", org.jruby.RubyTime.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("succ", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$getgm(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getgm", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "getgm", org.jruby.RubyTime.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("getgm", javaMethod);
        cls.addMethodAtBootTimeOnly("getutc", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hash", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "hash", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("hash", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$mday(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "mday", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "mday", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("mday", javaMethod);
        cls.addMethodAtBootTimeOnly("day", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$gmt(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "gmt", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "gmt", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("gmt?", javaMethod);
        cls.addMethodAtBootTimeOnly("utc?", javaMethod);
        cls.addMethodAtBootTimeOnly("gmtime?", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$hour(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hour", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "hour", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("hour", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$gmtime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "gmtime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "gmtime", org.jruby.RubyTime.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("gmtime", javaMethod);
        cls.addMethodAtBootTimeOnly("utc", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$initialize_copy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$gmt_offset(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "gmt_offset", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "gmt_offset", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("gmt_offset", javaMethod);
        cls.addMethodAtBootTimeOnly("gmtoff", javaMethod);
        cls.addMethodAtBootTimeOnly("utc_offset", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$isdst(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "isdst", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "isdst", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("isdst", javaMethod);
        cls.addMethodAtBootTimeOnly("dst?", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$yday(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "yday", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "yday", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("yday", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_le(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_le", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_le", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<=", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$sec(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "sec", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "sec", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("sec", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$month(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "month", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "month", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("month", javaMethod);
        cls.addMethodAtBootTimeOnly("mon", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$eql_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "eql_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "eql_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_gt(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_gt", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_gt", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly(">", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$zone(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "zone", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "zone", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("zone", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$to_a(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_a", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "to_a", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_a", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_lt(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_lt", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_lt", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyTime","getlocal","getlocal");
        runtime.addBoundMethod("org.jruby.RubyTime","to_f","to_f");
        runtime.addBoundMethod("org.jruby.RubyTime","op_eqq","===");
        runtime.addBoundMethod("org.jruby.RubyTime","asctime","asctime");
        runtime.addBoundMethod("org.jruby.RubyTime","wday","wday");
        runtime.addBoundMethod("org.jruby.RubyTime","to_i","to_i");
        runtime.addBoundMethod("org.jruby.RubyTime","op_ge",">=");
        runtime.addBoundMethod("org.jruby.RubyTime","usec","usec");
        runtime.addBoundMethod("org.jruby.RubyTime","op_cmp","<=>");
        runtime.addBoundMethod("org.jruby.RubyTime","dump","_dump");
        runtime.addBoundMethod("org.jruby.RubyTime","year","year");
        runtime.addBoundMethod("org.jruby.RubyTime","strftime","strftime");
        runtime.addBoundMethod("org.jruby.RubyTime","min","min");
        runtime.addBoundMethod("org.jruby.RubyTime","localtime","localtime");
        runtime.addBoundMethod("org.jruby.RubyTime","succ","succ");
        runtime.addBoundMethod("org.jruby.RubyTime","getgm","getgm");
        runtime.addBoundMethod("org.jruby.RubyTime","hash","hash");
        runtime.addBoundMethod("org.jruby.RubyTime","mday","mday");
        runtime.addBoundMethod("org.jruby.RubyTime","gmt","gmt?");
        runtime.addBoundMethod("org.jruby.RubyTime","hour","hour");
        runtime.addBoundMethod("org.jruby.RubyTime","gmtime","gmtime");
        runtime.addBoundMethod("org.jruby.RubyTime","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.RubyTime","gmt_offset","gmt_offset");
        runtime.addBoundMethod("org.jruby.RubyTime","initialize","initialize");
        runtime.addBoundMethod("org.jruby.RubyTime","isdst","isdst");
        runtime.addBoundMethod("org.jruby.RubyTime","yday","yday");
        runtime.addBoundMethod("org.jruby.RubyTime","op_le","<=");
        runtime.addBoundMethod("org.jruby.RubyTime","sec","sec");
        runtime.addBoundMethod("org.jruby.RubyTime","month","month");
        runtime.addBoundMethod("org.jruby.RubyTime","eql_p","eql?");
        runtime.addBoundMethod("org.jruby.RubyTime","op_gt",">");
        runtime.addBoundMethod("org.jruby.RubyTime","zone","zone");
        runtime.addBoundMethod("org.jruby.RubyTime","to_a","to_a");
        runtime.addBoundMethod("org.jruby.RubyTime","op_lt","<");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_plus(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_plus", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_plus", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("+", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_minus(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_minus", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_minus", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("-", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyTime","op_plus","+");
        runtime.addBoundMethod("org.jruby.RubyTime","to_s","to_s");
        runtime.addBoundMethod("org.jruby.RubyTime","op_minus","-");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$subsec(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "subsec", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "subsec", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("subsec", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$1$localtime19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "localtime19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "localtime19", org.jruby.RubyTime.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("localtime", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$nsec(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "nsec", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "nsec", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("nsec", javaMethod);
        cls.addMethodAtBootTimeOnly("tv_nsec", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_plus19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_plus19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_plus19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("+", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$1$round(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "round", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "round", org.jruby.RubyTime.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("round", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$to_r(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_r", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "to_r", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_r", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$0$0$to_s19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "to_s19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyTime$INVOKER$i$1$0$op_minus19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_minus19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyTime.class, "op_minus19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("-", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyTime","subsec","subsec");
        runtime.addBoundMethod("org.jruby.RubyTime","localtime19","localtime");
        runtime.addBoundMethod("org.jruby.RubyTime","op_equal","==");
        runtime.addBoundMethod("org.jruby.RubyTime","nsec","nsec");
        runtime.addBoundMethod("org.jruby.RubyTime","op_plus19","+");
        runtime.addBoundMethod("org.jruby.RubyTime","round","round");
        runtime.addBoundMethod("org.jruby.RubyTime","to_r","to_r");
        runtime.addBoundMethod("org.jruby.RubyTime","to_s19","to_s");
        runtime.addBoundMethod("org.jruby.RubyTime","op_minus19","-");
        }
    }
    static {
     }
}
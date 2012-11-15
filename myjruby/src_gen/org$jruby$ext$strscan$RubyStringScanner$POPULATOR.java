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
public class org$jruby$ext$strscan$RubyStringScanner$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$s$0$0$mustCversion(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "mustCversion", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "mustCversion", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("must_C_version", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","mustCversion","must_C_version");
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$rest_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rest_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "rest_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("rest?", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$rest_size(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rest_size", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "rest_size", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("rest_size", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$initialize_copy(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$op_aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_aref", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "op_aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$terminate(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "terminate", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "terminate", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("terminate", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$matched(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "matched", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "matched", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("matched", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$getbyte(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getbyte", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "getbyte", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("getbyte", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$3$0$scan_full(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 3, "scan_full", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "scan_full", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("scan_full", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$set_string(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_string", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "set_string", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("string=", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$exist_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "exist_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "exist_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("exist?", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$skip(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "skip", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "skip", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("skip", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$pos(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "pos", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "pos", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("pos", javaMethod);
        cls.addMethodAtBootTimeOnly("pointer", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$clear(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "clear", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "clear", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("clear", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$reset(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "reset", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "reset", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("reset", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$3$0$search_full(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 3, "search_full", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "search_full", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("search_full", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$peek(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "peek", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "peek", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("peek", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$matchedsize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "matchedsize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "matchedsize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("matchedsize", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$peep(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "peep", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "peep", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("peep", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$empty_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "empty_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "empty_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("empty?", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$check(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "check", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "check", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("check", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$bol_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bol_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "bol_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("beginning_of_line?", javaMethod);
        cls.defineAlias("bol?", "beginning_of_line?");
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$post_match(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "post_match", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "post_match", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("post_match", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$set_pos(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_pos", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "set_pos", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("pos=", javaMethod);
        cls.addMethodAtBootTimeOnly("pointer=", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$match_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "match_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "match_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("match?", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$concat(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "concat", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "concat", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("concat", javaMethod);
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$unscan(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "unscan", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "unscan", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("unscan", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$check_until(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "check_until", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "check_until", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("check_until", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$matched_size(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "matched_size", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "matched_size", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("matched_size", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$matched_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "matched_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "matched_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("matched?", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$1$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$skip_until(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "skip_until", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "skip_until", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("skip_until", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$pre_match(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "pre_match", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "pre_match", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("pre_match", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$eos_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "eos_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "eos_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("eos?", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$string(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "string", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "string", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("string", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$scan_until(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "scan_until", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "scan_until", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("scan_until", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$get_byte(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "get_byte", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "get_byte", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("get_byte", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$1$0$scan(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "scan", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "scan", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("scan", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$rest(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rest", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "rest", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("rest", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$restsize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "restsize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "restsize", org.jruby.RubyFixnum.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("restsize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","rest_p","rest?");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","rest_size","rest_size");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","op_aref","[]");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","terminate","terminate");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","matched","matched");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","getbyte","getbyte");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","scan_full","scan_full");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","set_string","string=");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","exist_p","exist?");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","skip","skip");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","pos","pos");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","clear","clear");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","reset","reset");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","search_full","search_full");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","peek","peek");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","matchedsize","matchedsize");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","peep","peep");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","empty_p","empty?");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","check","check");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","bol_p","beginning_of_line?");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","post_match","post_match");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","set_pos","pos=");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","match_p","match?");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","concat","concat");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","unscan","unscan");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","check_until","check_until");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","matched_size","matched_size");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","matched_p","matched?");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","skip_until","skip_until");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","pre_match","pre_match");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","eos_p","eos?");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","string","string");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","scan_until","scan_until");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","get_byte","get_byte");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","scan","scan");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","rest","rest");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","inspect","inspect");
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","restsize","restsize");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$getch(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getch", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "getch", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("getch", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","getch","getch");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.strscan.RubyStringScanner$INVOKER$i$0$0$getch19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getch19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.strscan.RubyStringScanner.class, "getch19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("getch", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.strscan.RubyStringScanner","getch19","getch");
        }
    }
    static {
     }
}
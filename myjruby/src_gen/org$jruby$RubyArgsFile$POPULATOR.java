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
public class org$jruby$RubyArgsFile$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$1$each_byte(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "each_byte", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "each_byte", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_byte", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$1$0$lineno_set(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "lineno_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "lineno_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("lineno=", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$readchar(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "readchar", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "readchar", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("readchar", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$skip(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "skip", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "skip", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("skip", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$rewind(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rewind", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "rewind", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("rewind", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$close(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "close", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "close", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("close", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$each_char(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each_char", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "each_char", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_char", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$eof_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "eof_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "eof_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eof?", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$file(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "file", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "file", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("file", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$2$read(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "read", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "read", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("read", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$tell(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "tell", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "tell", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("tell", javaMethod);
        cls.defineAlias("pos", "tell");
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$1$each_line(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "each_line", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "each_line", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_line", javaMethod);
        cls.addMethodAtBootTimeOnly("each", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$1$readline(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "readline", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "readline", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("readline", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$to_io(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_io", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "to_io", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_io", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$1$gets(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "gets", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "gets", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("gets", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$1$0$set_pos(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_pos", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "set_pos", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("pos=", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$chars(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "chars", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "chars", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("chars", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$1$seek(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "seek", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "seek", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("seek", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$1$bytes(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "bytes", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "bytes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("bytes", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$1$to_a(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "to_a", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "to_a", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("to_a", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$fileno(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "fileno", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "fileno", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("fileno", javaMethod);
        cls.addMethodAtBootTimeOnly("to_i", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$lineno(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "lineno", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "lineno", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("lineno", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$getc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getc", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "getc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("getc", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$closed_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "closed_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "closed_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("closed?", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$1$readlines(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "readlines", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "readlines", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("readlines", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$filename(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "filename", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "filename", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("filename", javaMethod);
        cls.defineAlias("path", "filename");
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$eof(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "eof", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "eof", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eof", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$binmode(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "binmode", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "binmode", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("binmode", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyArgsFile","each_byte","each_byte");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","lineno_set","lineno=");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","readchar","readchar");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","skip","skip");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","rewind","rewind");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","to_s","to_s");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","close","close");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","each_char","each_char");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","eof_p","eof?");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","file","file");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","read","read");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","tell","tell");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","each_line","each_line");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","readline","readline");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","to_io","to_io");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","gets","gets");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","set_pos","pos=");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","chars","chars");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","seek","seek");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","bytes","bytes");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","to_a","to_a");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","fileno","fileno");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","lineno","lineno");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","getc","getc");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","closed_p","closed?");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","readlines","readlines");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","filename","filename");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","eof","eof");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","binmode","binmode");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$0$op_binmode(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "op_binmode", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "op_binmode", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("binmode?", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$1$each_line19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "each_line19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "each_line19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_line", javaMethod);
        javaMethod = new org.jruby.RubyArgsFile$INVOKER$s$0$1$each19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "each19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyArgsFile.class, "each19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyArgsFile","op_binmode","binmode?");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","each_line19","each_line");
        runtime.addBoundMethod("org.jruby.RubyArgsFile","each19","each");
        }
    }
    static {
     }
}

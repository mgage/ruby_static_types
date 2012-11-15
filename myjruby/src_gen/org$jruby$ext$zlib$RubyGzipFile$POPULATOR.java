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
public class org$jruby$ext$zlib$RubyGzipFile$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "newInstance", org.jruby.ext.zlib.RubyGzipFile.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$s$1$0$wrap(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "wrap", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "wrap", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("wrap", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","newInstance","new");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","wrap","wrap");
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$1$0$set_sync(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_sync", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "set_sync", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("sync=", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$finish(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "finish", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "finish", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("finish", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$level(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "level", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "level", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("level", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$crc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "crc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "crc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("crc", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$sync(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "sync", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "sync", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("sync", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$to_io(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_io", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "to_io", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_io", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$orig_name(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "orig_name", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "orig_name", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("orig_name", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$closed_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "closed_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "closed_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("closed?", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$mtime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "mtime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "mtime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("mtime", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$os_code(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "os_code", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "os_code", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("os_code", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$comment(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "comment", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "comment", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("comment", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyGzipFile$INVOKER$i$0$0$close(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "close", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyGzipFile.class, "close", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("close", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","set_sync","sync=");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","finish","finish");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","level","level");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","crc","crc");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","sync","sync");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","to_io","to_io");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","orig_name","orig_name");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","closed_p","closed?");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","mtime","mtime");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","os_code","os_code");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","comment","comment");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyGzipFile","close","close");
    }
    static {
     }
}
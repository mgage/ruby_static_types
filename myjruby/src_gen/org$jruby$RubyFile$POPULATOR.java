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
public class org$jruby$RubyFile$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$0$utime(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "utime", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "utime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("utime", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$extname(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "extname", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "extname", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("extname", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$1$fnmatch(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fnmatch", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "fnmatch", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("fnmatch", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("fnmatch?", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$0$lchown(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "lchown", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "lchown", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("lchown", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$atime(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "atime", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "atime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("atime", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$readlink(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "readlink", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "readlink", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("readlink", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$0$chown(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "chown", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "chown", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("chown", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$split(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "split", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "split", org.jruby.RubyArray.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("split", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$mtime(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "mtime", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "mtime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("mtime", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$2$0$rename(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "rename", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "rename", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("rename", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$dirname(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "dirname", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "dirname", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("dirname", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$1$basename(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "basename", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "basename", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("basename", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$0$unlink(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "unlink", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "unlink", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("unlink", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("delete", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$0$join(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "join", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "join", org.jruby.RubyString.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("join", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$ctime(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "ctime", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "ctime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("ctime", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$0$chmod(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "chmod", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "chmod", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("chmod", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$stat(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "stat", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "stat", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("stat", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$1$umask(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "umask", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "umask", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("umask", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$2$0$symlink(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "symlink", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "symlink", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("symlink", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$lstat(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "lstat", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "lstat", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("lstat", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$2$0$link(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "link", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "link", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("link", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$0$lchmod(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "lchmod", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "lchmod", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("lchmod", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$ftype(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "ftype", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "ftype", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("ftype", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyFile","utime","utime");
        runtime.addBoundMethod("org.jruby.RubyFile","extname","extname");
        runtime.addBoundMethod("org.jruby.RubyFile","fnmatch","fnmatch");
        runtime.addBoundMethod("org.jruby.RubyFile","lchown","lchown");
        runtime.addBoundMethod("org.jruby.RubyFile","atime","atime");
        runtime.addBoundMethod("org.jruby.RubyFile","readlink","readlink");
        runtime.addBoundMethod("org.jruby.RubyFile","chown","chown");
        runtime.addBoundMethod("org.jruby.RubyFile","split","split");
        runtime.addBoundMethod("org.jruby.RubyFile","mtime","mtime");
        runtime.addBoundMethod("org.jruby.RubyFile","rename","rename");
        runtime.addBoundMethod("org.jruby.RubyFile","dirname","dirname");
        runtime.addBoundMethod("org.jruby.RubyFile","basename","basename");
        runtime.addBoundMethod("org.jruby.RubyFile","unlink","unlink");
        runtime.addBoundMethod("org.jruby.RubyFile","join","join");
        runtime.addBoundMethod("org.jruby.RubyFile","ctime","ctime");
        runtime.addBoundMethod("org.jruby.RubyFile","chmod","chmod");
        runtime.addBoundMethod("org.jruby.RubyFile","stat","stat");
        runtime.addBoundMethod("org.jruby.RubyFile","umask","umask");
        runtime.addBoundMethod("org.jruby.RubyFile","symlink","symlink");
        runtime.addBoundMethod("org.jruby.RubyFile","lstat","lstat");
        runtime.addBoundMethod("org.jruby.RubyFile","link","link");
        runtime.addBoundMethod("org.jruby.RubyFile","lchmod","lchmod");
        runtime.addBoundMethod("org.jruby.RubyFile","ftype","ftype");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyFile$INVOKER$s$2$0$truncate(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "truncate", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "truncate", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("truncate", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$1$expand_path(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "expand_path", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "expand_path", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("expand_path", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyFile","truncate","truncate");
        runtime.addBoundMethod("org.jruby.RubyFile","expand_path","expand_path");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyFile$INVOKER$s$1$0$path(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "path", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "path", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("path", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$2$0$truncate19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "truncate19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "truncate19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("truncate", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$1$realdirpath(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "realdirpath", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "realdirpath", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("realdirpath", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$1$absolute_path(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "absolute_path", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "absolute_path", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("absolute_path", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$1$expand_path19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "expand_path19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "expand_path19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("expand_path", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$s$0$1$realpath(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "realpath", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "realpath", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("realpath", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyFile","path","path");
        runtime.addBoundMethod("org.jruby.RubyFile","truncate19","truncate");
        runtime.addBoundMethod("org.jruby.RubyFile","realdirpath","realdirpath");
        runtime.addBoundMethod("org.jruby.RubyFile","absolute_path","absolute_path");
        runtime.addBoundMethod("org.jruby.RubyFile","expand_path19","expand_path");
        runtime.addBoundMethod("org.jruby.RubyFile","realpath","realpath");
        }
        javaMethod = new org.jruby.RubyFile$INVOKER$i$2$0$lchown(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "lchown", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "lchown", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("lchown", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$2$0$chown(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "chown", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "chown", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("chown", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$0$mtime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "mtime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "mtime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("mtime", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$1$0$chmod(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "chmod", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "chmod", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("chmod", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$0$atime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "atime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "atime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("atime", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$0$close(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "close", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "close", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("close", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$0$stat(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "stat", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "stat", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("stat", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$1$0$truncate(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "truncate", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "truncate", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("truncate", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$0$lstat(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "lstat", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "lstat", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("lstat", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$1$0$lchmod(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "lchmod", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "lchmod", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("lchmod", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$0$path(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "path", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "path", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("path", javaMethod);
        cls.addMethodAtBootTimeOnly("to_path", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$0$ctime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ctime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "ctime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("ctime", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$1$0$flock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "flock", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "flock", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("flock", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyFile","lchown","lchown");
        runtime.addBoundMethod("org.jruby.RubyFile","chown","chown");
        runtime.addBoundMethod("org.jruby.RubyFile","inspect","inspect");
        runtime.addBoundMethod("org.jruby.RubyFile","mtime","mtime");
        runtime.addBoundMethod("org.jruby.RubyFile","chmod","chmod");
        runtime.addBoundMethod("org.jruby.RubyFile","atime","atime");
        runtime.addBoundMethod("org.jruby.RubyFile","close","close");
        runtime.addBoundMethod("org.jruby.RubyFile","stat","stat");
        runtime.addBoundMethod("org.jruby.RubyFile","truncate","truncate");
        runtime.addBoundMethod("org.jruby.RubyFile","lstat","lstat");
        runtime.addBoundMethod("org.jruby.RubyFile","lchmod","lchmod");
        runtime.addBoundMethod("org.jruby.RubyFile","path","path");
        runtime.addBoundMethod("org.jruby.RubyFile","ctime","ctime");
        runtime.addBoundMethod("org.jruby.RubyFile","flock","flock");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$2$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyFile","initialize","initialize");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$0$size(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "size", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "size", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        javaMethod = new org.jruby.RubyFile$INVOKER$i$0$2$initialize19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFile.class, "initialize19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyFile","size","size");
        runtime.addBoundMethod("org.jruby.RubyFile","initialize19","initialize");
        }
    }
    static {
     }
}
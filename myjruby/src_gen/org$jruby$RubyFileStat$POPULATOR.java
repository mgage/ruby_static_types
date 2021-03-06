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
public class org$jruby$RubyFileStat$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$uid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "uid", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "uid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("uid", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$size_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "size_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "size_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("size?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$atime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "atime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "atime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("atime", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$dev(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "dev", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "dev", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("dev", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$symlink_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "symlink_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "symlink_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("symlink?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$blksize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "blksize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "blksize", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("blksize", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$nlink(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "nlink", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "nlink", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("nlink", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$owned_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "owned_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "owned_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("owned?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$setgid_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "setgid_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "setgid_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("setgid?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$rdev(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rdev", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "rdev", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("rdev", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$1$0$cmp(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "cmp", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "cmp", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<=>", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$mode(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "mode", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "mode", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("mode", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$sticky_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "sticky_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "sticky_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("sticky?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$file_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "file_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "file_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("file?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$readableReal_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "readableReal_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "readableReal_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("readable_real?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$devMinor(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "devMinor", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "devMinor", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("dev_minor", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$devMajor(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "devMajor", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "devMajor", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("dev_major", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$writable_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "writable_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "writable_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("writable?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$chardev_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "chardev_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "chardev_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("chardev?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$ino(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ino", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "ino", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("ino", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$group_owned_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "group_owned_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "group_owned_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("grpowned?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$writableReal_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "writableReal_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "writableReal_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("writable_real?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$mtime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "mtime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "mtime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("mtime", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$rdevMinor(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rdevMinor", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "rdevMinor", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("rdev_minor", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$readable_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "readable_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "readable_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("readable?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$blocks(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "blocks", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "blocks", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("blocks", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$zero_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "zero_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "zero_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("zero?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$1$0$initialize_copy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$ctime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ctime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "ctime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("ctime", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$size(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "size", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "size", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$rdevMajor(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rdevMajor", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "rdevMajor", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("rdev_major", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$executable_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "executable_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "executable_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("executable?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$pipe_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "pipe_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "pipe_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("pipe?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$directory_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "directory_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "directory_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("directory?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$setuid_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "setuid_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "setuid_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("setuid?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$gid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "gid", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "gid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("gid", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$socket_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "socket_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "socket_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("socket?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$ftype(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ftype", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "ftype", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("ftype", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$blockdev_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "blockdev_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "blockdev_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("blockdev?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$executableReal_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "executableReal_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "executableReal_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("executable_real?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyFileStat","uid","uid");
        runtime.addBoundMethod("org.jruby.RubyFileStat","size_p","size?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","atime","atime");
        runtime.addBoundMethod("org.jruby.RubyFileStat","dev","dev");
        runtime.addBoundMethod("org.jruby.RubyFileStat","symlink_p","symlink?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","blksize","blksize");
        runtime.addBoundMethod("org.jruby.RubyFileStat","nlink","nlink");
        runtime.addBoundMethod("org.jruby.RubyFileStat","owned_p","owned?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","setgid_p","setgid?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","rdev","rdev");
        runtime.addBoundMethod("org.jruby.RubyFileStat","cmp","<=>");
        runtime.addBoundMethod("org.jruby.RubyFileStat","mode","mode");
        runtime.addBoundMethod("org.jruby.RubyFileStat","sticky_p","sticky?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","file_p","file?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","readableReal_p","readable_real?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","devMinor","dev_minor");
        runtime.addBoundMethod("org.jruby.RubyFileStat","devMajor","dev_major");
        runtime.addBoundMethod("org.jruby.RubyFileStat","writable_p","writable?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","chardev_p","chardev?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","ino","ino");
        runtime.addBoundMethod("org.jruby.RubyFileStat","group_owned_p","grpowned?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","writableReal_p","writable_real?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","mtime","mtime");
        runtime.addBoundMethod("org.jruby.RubyFileStat","rdevMinor","rdev_minor");
        runtime.addBoundMethod("org.jruby.RubyFileStat","readable_p","readable?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","blocks","blocks");
        runtime.addBoundMethod("org.jruby.RubyFileStat","zero_p","zero?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.RubyFileStat","ctime","ctime");
        runtime.addBoundMethod("org.jruby.RubyFileStat","size","size");
        runtime.addBoundMethod("org.jruby.RubyFileStat","rdevMajor","rdev_major");
        runtime.addBoundMethod("org.jruby.RubyFileStat","executable_p","executable?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","pipe_p","pipe?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","directory_p","directory?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","setuid_p","setuid?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","gid","gid");
        runtime.addBoundMethod("org.jruby.RubyFileStat","socket_p","socket?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","ftype","ftype");
        runtime.addBoundMethod("org.jruby.RubyFileStat","blockdev_p","blockdev?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","executableReal_p","executable_real?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","inspect","inspect");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$1$0$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyFileStat","initialize","initialize");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$worldWritable(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "worldWritable", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "worldWritable", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("world_writable?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$0$0$worldReadable(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "worldReadable", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "worldReadable", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("world_readable?", javaMethod);
        javaMethod = new org.jruby.RubyFileStat$INVOKER$i$1$0$initialize19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyFileStat.class, "initialize19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyFileStat","worldWritable","world_writable?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","worldReadable","world_readable?");
        runtime.addBoundMethod("org.jruby.RubyFileStat","initialize19","initialize");
        }
    }
    static {
     }
}

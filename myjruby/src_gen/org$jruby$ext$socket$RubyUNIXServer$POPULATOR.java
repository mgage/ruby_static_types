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
public class org$jruby$ext$socket$RubyUNIXServer$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.socket.RubyUNIXServer$INVOKER$i$1$0$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXServer.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXServer$INVOKER$i$0$0$path(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "path", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXServer.class, "path", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("path", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXServer$INVOKER$i$1$0$listen(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "listen", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXServer.class, "listen", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("listen", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXServer$INVOKER$i$0$0$peeraddr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "peeraddr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXServer.class, "peeraddr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("peeraddr", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXServer$INVOKER$i$0$0$addr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "addr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXServer.class, "addr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("addr", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXServer$INVOKER$i$0$0$accept(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "accept", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXServer.class, "accept", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("accept", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXServer$INVOKER$i$0$0$accept_nonblock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "accept_nonblock", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXServer.class, "accept_nonblock", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("accept_nonblock", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXServer$INVOKER$i$0$0$sysaccept(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "sysaccept", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXServer.class, "sysaccept", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("sysaccept", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXServer","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXServer","path","path");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXServer","listen","listen");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXServer","peeraddr","peeraddr");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXServer","addr","addr");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXServer","accept","accept");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXServer","accept_nonblock","accept_nonblock");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXServer","sysaccept","sysaccept");
    }
    static {
     }
}

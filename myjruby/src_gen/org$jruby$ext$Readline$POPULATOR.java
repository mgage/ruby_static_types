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
public class org$jruby$ext$Readline$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$0$0$s_get_basic_word_break_character(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "s_get_basic_word_break_character", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_get_basic_word_break_character", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("basic_word_break_characters", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("basic_word_break_characters", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$0$0$unimplemented(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "unimplemented", true, CallConfiguration.FrameFullScopeNone, false, org.jruby.ext.Readline.class, "unimplemented", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("basic_quote_characters", javaMethod);
        cls.addMethodAtBootTimeOnly("basic_quote_characters=", javaMethod);
        cls.addMethodAtBootTimeOnly("completer_quote_characters", javaMethod);
        cls.addMethodAtBootTimeOnly("completer_quote_characters=", javaMethod);
        cls.addMethodAtBootTimeOnly("completer_word_break_characters", javaMethod);
        cls.addMethodAtBootTimeOnly("completer_word_break_characters=", javaMethod);
        cls.addMethodAtBootTimeOnly("completion_append_character", javaMethod);
        cls.addMethodAtBootTimeOnly("completion_proc", javaMethod);
        cls.addMethodAtBootTimeOnly("emacs_editing_mode", javaMethod);
        cls.addMethodAtBootTimeOnly("filename_quote_characters", javaMethod);
        cls.addMethodAtBootTimeOnly("filename_quote_characters=", javaMethod);
        cls.addMethodAtBootTimeOnly("vi_editing_mode", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("basic_quote_characters", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("basic_quote_characters=", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completer_quote_characters", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completer_quote_characters=", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completer_word_break_characters", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completer_word_break_characters=", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completion_append_character", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completion_proc", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("emacs_editing_mode", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("filename_quote_characters", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("filename_quote_characters=", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("vi_editing_mode", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$0$0$s_get_completion_case_fold(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "s_get_completion_case_fold", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_get_completion_case_fold", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("completion_case_fold", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("completion_case_fold", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$s_readline(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "s_readline", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_readline", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("readline", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("readline", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$1$0$s_set_completion_case_fold(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "s_set_completion_case_fold", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_set_completion_case_fold", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("completion_case_fold=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("completion_case_fold=", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$1$0$s_set_completion_proc(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "s_set_completion_proc", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_set_completion_proc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("completion_proc=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("completion_proc=", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$1$0$s_set_basic_word_break_character(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "s_set_basic_word_break_character", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_set_basic_word_break_character", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("basic_word_break_characters=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("basic_word_break_characters=", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$1$0$s_set_completion_append_character(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "s_set_completion_append_character", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_set_completion_append_character", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("completion_append_character=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("completion_append_character=", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.Readline","s_get_basic_word_break_character","basic_word_break_characters");
        runtime.addBoundMethod("org.jruby.ext.Readline","unimplemented","basic_quote_characters");
        runtime.addBoundMethod("org.jruby.ext.Readline","s_get_completion_case_fold","completion_case_fold");
        runtime.addBoundMethod("org.jruby.ext.Readline","s_readline","readline");
        runtime.addBoundMethod("org.jruby.ext.Readline","s_set_completion_case_fold","completion_case_fold=");
        runtime.addBoundMethod("org.jruby.ext.Readline","s_set_completion_proc","completion_proc=");
        runtime.addBoundMethod("org.jruby.ext.Readline","s_set_basic_word_break_character","basic_word_break_characters=");
        runtime.addBoundMethod("org.jruby.ext.Readline","s_set_completion_append_character","completion_append_character=");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$0$0$s_get_point(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "s_get_point", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_get_point", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("point", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("point", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$0$0$s_refresh_line(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "s_refresh_line", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_refresh_line", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("refresh_line", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("refresh_line", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$0$0$unimplemented19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "unimplemented19", true, CallConfiguration.FrameFullScopeNone, false, org.jruby.ext.Readline.class, "unimplemented19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("basic_quote_characters", javaMethod);
        cls.addMethodAtBootTimeOnly("basic_quote_characters=", javaMethod);
        cls.addMethodAtBootTimeOnly("completer_quote_characters", javaMethod);
        cls.addMethodAtBootTimeOnly("completer_quote_characters=", javaMethod);
        cls.addMethodAtBootTimeOnly("completer_word_break_characters", javaMethod);
        cls.addMethodAtBootTimeOnly("completer_word_break_characters=", javaMethod);
        cls.addMethodAtBootTimeOnly("completion_append_character", javaMethod);
        cls.addMethodAtBootTimeOnly("completion_proc", javaMethod);
        cls.addMethodAtBootTimeOnly("emacs_editing_mode", javaMethod);
        cls.addMethodAtBootTimeOnly("emacs_editing_mode?", javaMethod);
        cls.addMethodAtBootTimeOnly("filename_quote_characters", javaMethod);
        cls.addMethodAtBootTimeOnly("filename_quote_characters=", javaMethod);
        cls.addMethodAtBootTimeOnly("vi_editing_mode", javaMethod);
        cls.addMethodAtBootTimeOnly("vi_editing_mode?", javaMethod);
        cls.addMethodAtBootTimeOnly("set_screen_size", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("basic_quote_characters", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("basic_quote_characters=", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completer_quote_characters", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completer_quote_characters=", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completer_word_break_characters", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completer_word_break_characters=", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completion_append_character", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("completion_proc", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("emacs_editing_mode", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("emacs_editing_mode?", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("filename_quote_characters", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("filename_quote_characters=", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("vi_editing_mode", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("vi_editing_mode?", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("set_screen_size", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$0$0$s_get_line_buffer(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "s_get_line_buffer", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_get_line_buffer", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("line_buffer", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("line_buffer", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$1$0$setInput(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "setInput", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "setInput", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("input=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("input=", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$0$0$s_get_screen_size(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "s_get_screen_size", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "s_get_screen_size", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("get_screen_size", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("get_screen_size", moduleMethod);
        javaMethod = new org.jruby.ext.Readline$INVOKER$s$1$0$setOutput(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "setOutput", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.Readline.class, "setOutput", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("output=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("output=", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.Readline","s_get_point","point");
        runtime.addBoundMethod("org.jruby.ext.Readline","s_refresh_line","refresh_line");
        runtime.addBoundMethod("org.jruby.ext.Readline","unimplemented19","basic_quote_characters");
        runtime.addBoundMethod("org.jruby.ext.Readline","s_get_line_buffer","line_buffer");
        runtime.addBoundMethod("org.jruby.ext.Readline","setInput","input=");
        runtime.addBoundMethod("org.jruby.ext.Readline","s_get_screen_size","get_screen_size");
        runtime.addBoundMethod("org.jruby.ext.Readline","setOutput","output=");
        }
    }
    static {
        ASTInspector.addFrameAwareMethods("set_screen_size","basic_quote_characters=","basic_quote_characters","completer_quote_characters","vi_editing_mode","completer_quote_characters=","completer_word_break_characters","emacs_editing_mode?","filename_quote_characters","completer_word_break_characters=","filename_quote_characters=","completion_append_character","vi_editing_mode?","completion_proc","emacs_editing_mode");
     }
}

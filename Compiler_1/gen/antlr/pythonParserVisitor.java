// Generated from D:/Compiler/Compiler_1/src/antlr/pythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pythonParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(pythonParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(pythonParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(pythonParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(pythonParser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(pythonParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code try_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(pythonParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code with_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(pythonParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class_or_func_def_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_or_func_def_stmt(pythonParser.Class_or_func_def_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(pythonParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#elif_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_clause(pythonParser.Elif_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(pythonParser.Else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#finally_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_clause(pythonParser.Finally_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(pythonParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(pythonParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(pythonParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(pythonParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(pythonParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(pythonParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#kwargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKwargs(pythonParser.KwargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#def_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_parameters(pythonParser.Def_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#def_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_parameter(pythonParser.Def_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#named_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_parameter(pythonParser.Named_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(pythonParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(pythonParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code del_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(pythonParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pass_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(pythonParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(pythonParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(pythonParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(pythonParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code raise_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(pythonParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yield_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(pythonParser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code import_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code from_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_stmt(pythonParser.From_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code global_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(pythonParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exec_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stmt(pythonParser.Exec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assert_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(pythonParser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonlocal_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(pythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(pythonParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(pythonParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#assign_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_part(pythonParser.Assign_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(pythonParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(pythonParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(pythonParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(pythonParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(pythonParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(pythonParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargslist(pythonParser.VarargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#vardef_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef_parameters(pythonParser.Vardef_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#vardef_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef_parameter(pythonParser.Vardef_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#varargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargs(pythonParser.VarargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#varkwargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarkwargs(pythonParser.VarkwargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#logical_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_test(pythonParser.Logical_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(pythonParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(pythonParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(pythonParser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(pythonParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(pythonParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(pythonParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(pythonParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(pythonParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(pythonParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(pythonParser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_arg(pythonParser.Yield_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(pythonParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(pythonParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(pythonParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(pythonParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(pythonParser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(pythonParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(pythonParser.Comp_iterContext ctx);
}
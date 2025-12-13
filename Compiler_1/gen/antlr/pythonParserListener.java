// Generated from D:/Compiler/Compiler_1/src/antlr/pythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(pythonParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(pythonParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(pythonParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(pythonParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(pythonParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(pythonParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(pythonParser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(pythonParser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(pythonParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(pythonParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code try_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(pythonParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code try_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(pythonParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code with_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(pythonParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code with_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(pythonParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_or_func_def_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClass_or_func_def_stmt(pythonParser.Class_or_func_def_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_or_func_def_stmt}
	 * labeled alternative in {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClass_or_func_def_stmt(pythonParser.Class_or_func_def_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(pythonParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(pythonParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void enterElif_clause(pythonParser.Elif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void exitElif_clause(pythonParser.Elif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(pythonParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(pythonParser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void enterFinally_clause(pythonParser.Finally_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void exitFinally_clause(pythonParser.Finally_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(pythonParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(pythonParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(pythonParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(pythonParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(pythonParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(pythonParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(pythonParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(pythonParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(pythonParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(pythonParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(pythonParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(pythonParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#kwargs}.
	 * @param ctx the parse tree
	 */
	void enterKwargs(pythonParser.KwargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#kwargs}.
	 * @param ctx the parse tree
	 */
	void exitKwargs(pythonParser.KwargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#def_parameters}.
	 * @param ctx the parse tree
	 */
	void enterDef_parameters(pythonParser.Def_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#def_parameters}.
	 * @param ctx the parse tree
	 */
	void exitDef_parameters(pythonParser.Def_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#def_parameter}.
	 * @param ctx the parse tree
	 */
	void enterDef_parameter(pythonParser.Def_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#def_parameter}.
	 * @param ctx the parse tree
	 */
	void exitDef_parameter(pythonParser.Def_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#named_parameter}.
	 * @param ctx the parse tree
	 */
	void enterNamed_parameter(pythonParser.Named_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#named_parameter}.
	 * @param ctx the parse tree
	 */
	void exitNamed_parameter(pythonParser.Named_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(pythonParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(pythonParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(pythonParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(pythonParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code del_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(pythonParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code del_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(pythonParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pass_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(pythonParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pass_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(pythonParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(pythonParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(pythonParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(pythonParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(pythonParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(pythonParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(pythonParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code raise_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(pythonParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code raise_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(pythonParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yield_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(pythonParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yield_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(pythonParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code import_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code import_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code from_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFrom_stmt(pythonParser.From_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code from_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFrom_stmt(pythonParser.From_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code global_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(pythonParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code global_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(pythonParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(pythonParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(pythonParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assert_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(pythonParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assert_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(pythonParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonlocal_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(pythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonlocal_stmt}
	 * labeled alternative in {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(pythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(pythonParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(pythonParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(pythonParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(pythonParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assign_part}.
	 * @param ctx the parse tree
	 */
	void enterAssign_part(pythonParser.Assign_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assign_part}.
	 * @param ctx the parse tree
	 */
	void exitAssign_part(pythonParser.Assign_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(pythonParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(pythonParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(pythonParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(pythonParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(pythonParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(pythonParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(pythonParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(pythonParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(pythonParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(pythonParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(pythonParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(pythonParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(pythonParser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(pythonParser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#vardef_parameters}.
	 * @param ctx the parse tree
	 */
	void enterVardef_parameters(pythonParser.Vardef_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#vardef_parameters}.
	 * @param ctx the parse tree
	 */
	void exitVardef_parameters(pythonParser.Vardef_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#vardef_parameter}.
	 * @param ctx the parse tree
	 */
	void enterVardef_parameter(pythonParser.Vardef_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#vardef_parameter}.
	 * @param ctx the parse tree
	 */
	void exitVardef_parameter(pythonParser.Vardef_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#varargs}.
	 * @param ctx the parse tree
	 */
	void enterVarargs(pythonParser.VarargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#varargs}.
	 * @param ctx the parse tree
	 */
	void exitVarargs(pythonParser.VarargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#varkwargs}.
	 * @param ctx the parse tree
	 */
	void enterVarkwargs(pythonParser.VarkwargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#varkwargs}.
	 * @param ctx the parse tree
	 */
	void exitVarkwargs(pythonParser.VarkwargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#logical_test}.
	 * @param ctx the parse tree
	 */
	void enterLogical_test(pythonParser.Logical_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#logical_test}.
	 * @param ctx the parse tree
	 */
	void exitLogical_test(pythonParser.Logical_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(pythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(pythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(pythonParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(pythonParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(pythonParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(pythonParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(pythonParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(pythonParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(pythonParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(pythonParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(pythonParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(pythonParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(pythonParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(pythonParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(pythonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(pythonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(pythonParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(pythonParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(pythonParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(pythonParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(pythonParser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(pythonParser.Yield_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(pythonParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(pythonParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(pythonParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(pythonParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(pythonParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(pythonParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(pythonParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(pythonParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(pythonParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(pythonParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(pythonParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(pythonParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(pythonParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(pythonParser.Comp_iterContext ctx);
}
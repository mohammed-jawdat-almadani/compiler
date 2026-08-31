// Generated from antlr/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code File}
	 * labeled alternative in {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile(PythonParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code File}
	 * labeled alternative in {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile(PythonParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PythonParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PythonParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simple_stmts}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmts(PythonParser.Simple_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simple_stmts}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmts(PythonParser.Simple_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(PythonParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(PythonParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(PythonParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(PythonParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaiseStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStmt(PythonParser.RaiseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaiseStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStmt(PythonParser.RaiseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DelStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelStmt(PythonParser.DelStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DelStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelStmt(PythonParser.DelStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStmt(PythonParser.YieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStmt(PythonParser.YieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmt(PythonParser.AssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmt(PythonParser.AssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStmt(PythonParser.GlobalStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStmt(PythonParser.GlobalStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonlocalStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocalStmt(PythonParser.NonlocalStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonlocalStmt}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocalStmt(PythonParser.NonlocalStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDefStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefStmt(PythonParser.FuncDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDefStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefStmt(PythonParser.FuncDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDefStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClassDefStmt(PythonParser.ClassDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDefStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClassDefStmt(PythonParser.ClassDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(PythonParser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(PythonParser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(PythonParser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(PythonParser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(PythonParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(PythonParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(PythonParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(PythonParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(PythonParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(PythonParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElif_stmt(PythonParser.Elif_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElif_stmt(PythonParser.Elif_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(PythonParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(PythonParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(PythonParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(PythonParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(PythonParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(PythonParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(PythonParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(PythonParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#except_block}.
	 * @param ctx the parse tree
	 */
	void enterExcept_block(PythonParser.Except_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#except_block}.
	 * @param ctx the parse tree
	 */
	void exitExcept_block(PythonParser.Except_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#finally_block}.
	 * @param ctx the parse tree
	 */
	void enterFinally_block(PythonParser.Finally_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#finally_block}.
	 * @param ctx the parse tree
	 */
	void exitFinally_block(PythonParser.Finally_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(PythonParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(PythonParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(PythonParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(PythonParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PythonParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PythonParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PythonParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PythonParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(PythonParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(PythonParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(PythonParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(PythonParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(PythonParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(PythonParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(PythonParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(PythonParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(PythonParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(PythonParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(PythonParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(PythonParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterInversion(PythonParser.InversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitInversion(PythonParser.InversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(PythonParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(PythonParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#bitwise_or}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_or(PythonParser.Bitwise_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#bitwise_or}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_or(PythonParser.Bitwise_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#bitwise_xor}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_xor(PythonParser.Bitwise_xorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#bitwise_xor}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_xor(PythonParser.Bitwise_xorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#bitwise_and}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_and(PythonParser.Bitwise_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#bitwise_and}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_and(PythonParser.Bitwise_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(PythonParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(PythonParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link PythonParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(PythonParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link PythonParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(PythonParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(PythonParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(PythonParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(PythonParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(PythonParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorPower}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorPower(PythonParser.FactorPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorPower}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorPower(PythonParser.FactorPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(PythonParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(PythonParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubscriptExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpr(PythonParser.SubscriptExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubscriptExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpr(PythonParser.SubscriptExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterAttributeExpr(PythonParser.AttributeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitAttributeExpr(PythonParser.AttributeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(PythonParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(PythonParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#genexp}.
	 * @param ctx the parse tree
	 */
	void enterGenexp(PythonParser.GenexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#genexp}.
	 * @param ctx the parse tree
	 */
	void exitGenexp(PythonParser.GenexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for_if_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_if_clause(PythonParser.For_if_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for_if_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_if_clause(PythonParser.For_if_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 */
	void enterSlices(PythonParser.SlicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 */
	void exitSlices(PythonParser.SlicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(PythonParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(PythonParser.SliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNameAtom(PythonParser.NameAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNameAtom(PythonParser.NameAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(PythonParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(PythonParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterGroupAtom(PythonParser.GroupAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitGroupAtom(PythonParser.GroupAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictSetAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDictSetAtom(PythonParser.DictSetAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictSetAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDictSetAtom(PythonParser.DictSetAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EllipsisAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEllipsisAtom(PythonParser.EllipsisAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EllipsisAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEllipsisAtom(PythonParser.EllipsisAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(PythonParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(PythonParser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dict_set}.
	 * @param ctx the parse tree
	 */
	void enterDict_set(PythonParser.Dict_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dict_set}.
	 * @param ctx the parse tree
	 */
	void exitDict_set(PythonParser.Dict_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(PythonParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(PythonParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 */
	void enterImport_from_targets(PythonParser.Import_from_targetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_from_targets}.
	 * @param ctx the parse tree
	 */
	void exitImport_from_targets(PythonParser.Import_from_targetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_from_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_from_as_names(PythonParser.Import_from_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_from_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_from_as_names(PythonParser.Import_from_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(PythonParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(PythonParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#targets}.
	 * @param ctx the parse tree
	 */
	void enterTargets(PythonParser.TargetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#targets}.
	 * @param ctx the parse tree
	 */
	void exitTargets(PythonParser.TargetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(PythonParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(PythonParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(PythonParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(PythonParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(PythonParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(PythonParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(PythonParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(PythonParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(PythonParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(PythonParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(PythonParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(PythonParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(PythonParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(PythonParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PythonParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PythonParser.NameContext ctx);
}
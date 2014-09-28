package parser;

import java.util.ArrayList;
import beaver.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class Parser extends beaver.Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ID = 1;
		static public final short LBRACKET = 2;
		static public final short LPAREN = 3;
		static public final short MINUS = 4;
		static public final short STRING_LITERAL = 5;
		static public final short TRUE = 6;
		static public final short FALSE = 7;
		static public final short INT_LITERAL = 8;
		static public final short RPAREN = 9;
		static public final short RCURLY = 10;
		static public final short INT = 11;
		static public final short VOID = 12;
		static public final short BOOLEAN = 13;
		static public final short LCURLY = 14;
		static public final short SEMICOLON = 15;
		static public final short IF = 16;
		static public final short WHILE = 17;
		static public final short RETURN = 18;
		static public final short BREAK = 19;
		static public final short RBRACKET = 20;
		static public final short COMMA = 21;
		static public final short PUBLIC = 22;
		static public final short IMPORT = 23;
		static public final short PLUS = 24;
		static public final short TIMES = 25;
		static public final short DIV = 26;
		static public final short MOD = 27;
		static public final short EQL = 28;
		static public final short MODULE = 29;
		static public final short ELSE = 30;
		static public final short TYPE = 31;
		static public final short EQEQ = 32;
		static public final short NEQ = 33;
		static public final short LEQ = 34;
		static public final short GEQ = 35;
		static public final short LT = 36;
		static public final short GT = 37;
	}
	static public class AltGoals {
		static public final short Dummy = 38;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pDbmTq5KKKXlzz2O644bf028GUYfGW9GIIq4aXG03f8bAazzwRD9Lc0H4ig7H22Rs4e08" +
		"gYgY8A0eA0ee8WeYA1Q$$cvsyR3Rl9Rp3uUXxvvkvS$UViZEpitS1nqeCHK#CnqHCmbJqGn" +
		"#yX1vu335u1QyX6etG64tG5CtG72qGwPMweLVgbbcgszhKMMdRUw7jRDEkmW9CmrXCnc8yW" +
		"oaYyWtMOotM8Huvq0eFenkws5NmJLV9FnvLGonj#NbKvSHWbogNHzK0z7Uf$BDG3NAf0bmg" +
		"#tpCK$DnTzusofiRTL1NpPy3Sr5TLYCCrJ0R#$0GQg4syc1XffeTtRRNtQstjrllTBVUfzr" +
		"wdyl2EzCsIqln0bx42Yp3SZnYloeRCkdjvL4OZJ5OawtENXwA2PRHzVMw$hsMhVqFv8hcrN" +
		"Uo7pMvac5o3QinIw$e28jsdCLEbjlOedP2CePZ6DCXUiVjHJvjcQcfse0gh54FWTpbEn31E" +
		"YFXWsSnIywpndQvZbUH7vla9xmkvpc2RKX20HH2GGIXC8gWA1wW9nZ5488IA8uoA8joA8yA" +
		"g8XGL499MOEgU12bK0EbKLdk84N#G3Zgem6Yv1nYaO14j4O7nA4TEk5nz49NF8ePU09pP2E" +
		"Un7mynV4iONaZhKLu6PlnF5RY3RaWts8hrtadTkC0Kh07kv3AVYkXCggmpwfy1ggptp3Edp" +
		"bhpgSad7SReVgFHDJ$Hds$j0PF11$uygpquqcM2#2vavldGLxkXf9SsG9SoKAPLEqiAdXK#" +
		"LfKkJsgyd27fAdoUrGvJ$qqLSXTgGguLExdmnjlGRuRpVbhoxtOdETo3Dy$xTLRC87dT25w" +
		"xxsN##Mrpr9forCOcEcgVoQFlLoCpt4md#xiTFQoVNJUrh$NSiR#6tANc7TYHX8nMc#kg5L" +
		"hjGtkQNCd62eACTY#kUEAy6zQPcggOlaK1R1LF#xoKdmRE#k4gdxygJTdFoTLpjoS#I0ryX" +
		"myEKknZY$76CGLAyxrAiEnEbL1R34Vvp#GhPJbyvUF#lBqLU092zOBODcVtW1b1T3suJ#Gp" +
		"uq$pz8Ij09fHHD$nXdnRC$1KZHFs23LQXnJvzzVZQYm6et1TWDLNU3WT3X$Zc0cYyXuievi" +
		"9IaabHmY5m239ufHbDocdhcZ3cb2uaXhqfRK9L4achGd3KbZqfJK9v6aEOaWCIIMT2UTI0B" +
		"fJ3gGZYIHz2RjI7yoW7GZNKWHqeiC8pL8F#TzfC5o21b1maavCf3qvOKvp0UP6iOTS0osrh" +
		"F3wsF94ArFeZrK#yTn7fOn7#wSG#Ozc9$GrpY7nYhcOrYuf7qZpTmOhykZRFtquRKahUb9T" +
		"kW#axNlC3NbCzOnvkdy6BcMUUp6oQpkJMlEiDs9UWoDj6ykxSdQDuMCrlwBj2Te#ohjIRQs" +
		"Rj4tbSpBka$739st8DEq7K#cQpiFsrhifbu3Cf#4acPa0LcghxKYixJjN9UPP0bPQAa$M#V" +
		"BoU9qFuxhF36x#VgluUySEPDUDewuqLonNB#UPlDhwhJ5lk5blpbjvSiw3z5vRKkVERGlFc" +
		"CT8x$dzerWCtS#ouPUKwpGrqunsMpJNz0vzw5nnqrxDxE$9oCqtNQqq7sUoAXnH6bjJUUPf" +
		"ZLdtRGLgVMjikitwp4vpr4Znes$cSuTpZFJ#tRTxfE3k4y$#Kjkg9of$2w$oQ#P5BTK#hMS" +
		"bJFobNmff#KBvVbSfQTSki$8ILVfKtA2V48#bkFoeModTKpUO$gkfCgRp5Fbe1oG5Dah#rd" +
		"QA$jaZ#oMNRHtoWxPBjiaMRRA5jciMjmaH#K3PIMfTBrArwbqhVmWbvLrLDwNT#I879P3yh" +
		"QyHSz7odz9fT$9KQRVorNvKQvakCkBAlt5LRufFtDk$bRsdqowCleqY8Eng1zZ5mS1unSVH" +
		"Z4E0XN9fD6Ix$04#3AYyMF4On0mCZ5SrB9GLLERRQKHopRRa3ZQV6VpgyL1mEy8moDrgGqd" +
		"zHWtr6Dq4y6yFkirKFZmgyF1oDHGXB5SISKVlWGgMgr9No9pTrIdjZ6lCpvWj6yegj7Nb3x" +
		"62uol31SLwQ$8lB97V1ZL#JAEDmWOmpiO3VamplFX5qu5TFWN4Q7zIG==");

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN6 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 6];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN9 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 9];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	static final Action RETURN7 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 7];
		}
	};

	static final Action RETURN37 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 37];
		}
	};

	// turn off automated error recovery
	@Override
	protected void recoverFromError(Symbol token, TokenStream in) throws java.io.IOException, Exception {
		super.recoverFromError(new Symbol(0), in);
	}

	private final Action[] actions;

	public Parser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			Action.RETURN,	// [0] $goal = Module
			RETURN2,	// [1] $goal = $Dummy Dummy; returns 'Dummy' although none is marked
			RETURN6,	// [2] Module = MODULE ID LCURLY Imports Declarations RCURLY; returns 'RCURLY' although none is marked
			RETURN2,	// [3] Imports = Import Imports; returns 'Imports' although none is marked
			Action.NONE,  	// [4] Imports = 
			RETURN3,	// [5] Import = IMPORT ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [6] Declarations = Declaration Declarations; returns 'Declarations' although none is marked
			Action.NONE,  	// [7] Declarations = 
			Action.RETURN,	// [8] Declaration = FunctionDeclaration
			Action.RETURN,	// [9] Declaration = FieldDeclaration
			Action.RETURN,	// [10] Declaration = TypeDeclaration
			RETURN9,	// [11] FunctionDeclaration = AccessId TypeName ID LPAREN ParameterList RPAREN LCURLY Statements RCURLY; returns 'RCURLY' although none is marked
			RETURN4,	// [12] FieldDeclaration = AccessId TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN6,	// [13] TypeDeclaration = AccessId TYPE ID EQL STRING_LITERAL SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [14] AccessId = PUBLIC
			Action.NONE,  	// [15] AccessId = 
			Action.RETURN,	// [16] TypeName = PrimitiveType
			Action.RETURN,	// [17] TypeName = ArrayType
			Action.RETURN,	// [18] TypeName = ID
			Action.RETURN,	// [19] PrimitiveType = VOID
			Action.RETURN,	// [20] PrimitiveType = BOOLEAN
			Action.RETURN,	// [21] PrimitiveType = INT
			Action.RETURN,	// [22] Boolean = TRUE
			Action.RETURN,	// [23] Boolean = FALSE
			RETURN3,	// [24] ArrayType = ID LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [25] ArrayType = ArrayType LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [26] ArrayType = PrimitiveType LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN2,	// [27] Parameter = TypeName ID; returns 'ID' although none is marked
			RETURN2,	// [28] ParameterList = Parameter ParameterY; returns 'ParameterY' although none is marked
			RETURN3,	// [29] ParameterY = COMMA Parameter ParameterY; returns 'ParameterY' although none is marked
			Action.NONE,  	// [30] ParameterY = 
			RETURN2,	// [31] Statements = Statement Statements; returns 'Statements' although none is marked
			Action.NONE,  	// [32] Statements = 
			Action.RETURN,	// [33] Statement = LocalVariableDeclaration
			Action.RETURN,	// [34] Statement = BlockStatement
			Action.RETURN,	// [35] Statement = IfStatement
			Action.RETURN,	// [36] Statement = WhileStatement
			Action.RETURN,	// [37] Statement = BreakStatement
			Action.RETURN,	// [38] Statement = ReturnStatement
			Action.RETURN,	// [39] Statement = ExpressionStatement
			RETURN3,	// [40] LocalVariableDeclaration = TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [41] BlockStatement = LCURLY Statements RCURLY; returns 'RCURLY' although none is marked
			RETURN5,	// [42] IfStatement = IF LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN7,	// [43] IfStatement = IF LPAREN Expression RPAREN Statement ELSE Statement; returns 'Statement' although none is marked
			RETURN5,	// [44] WhileStatement = WHILE LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN2,	// [45] BreakStatement = BREAK SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [46] ReturnStatement = RETURN SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [47] ReturnStatement = RETURN Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [48] ExpressionStatement = Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [49] Expression = Assignment
			Action.RETURN,	// [50] Expression = RhsExpression
			RETURN3,	// [51] Assignment = LhsExpression EQL Expression; returns 'Expression' although none is marked
			RETURN2,	// [52] LhsExpression = ID LhsExpressionY; returns 'LhsExpressionY' although none is marked
			RETURN4,	// [53] LhsExpressionY = LBRACKET Expression RBRACKET LhsExpressionY; returns 'LhsExpressionY' although none is marked
			Action.NONE,  	// [54] LhsExpressionY = 
			Action.RETURN,	// [55] RhsExpression = ArithmeticExpression
			RETURN3,	// [56] RhsExpression = ArithmeticExpression ComparisonOperator ArithmeticExpression; returns 'ArithmeticExpression' although none is marked
			Action.RETURN,	// [57] ComparisonOperator = EQEQ
			Action.RETURN,	// [58] ComparisonOperator = NEQ
			Action.RETURN,	// [59] ComparisonOperator = LT
			Action.RETURN,	// [60] ComparisonOperator = LEQ
			Action.RETURN,	// [61] ComparisonOperator = GT
			Action.RETURN,	// [62] ComparisonOperator = GEQ
			RETURN2,	// [63] ArithmeticExpression = Term ArithmeticExpressionY; returns 'ArithmeticExpressionY' although none is marked
			RETURN3,	// [64] ArithmeticExpressionY = AdditiveOperator Term ArithmeticExpressionY; returns 'ArithmeticExpressionY' although none is marked
			Action.NONE,  	// [65] ArithmeticExpressionY = 
			Action.RETURN,	// [66] AdditiveOperator = PLUS
			Action.RETURN,	// [67] AdditiveOperator = MINUS
			RETURN2,	// [68] Term = Factor TermY; returns 'TermY' although none is marked
			RETURN3,	// [69] TermY = MultiplicativeOperator Factor TermY; returns 'TermY' although none is marked
			Action.NONE,  	// [70] TermY = 
			Action.RETURN,	// [71] MultiplicativeOperator = TIMES
			Action.RETURN,	// [72] MultiplicativeOperator = DIV
			Action.RETURN,	// [73] MultiplicativeOperator = MOD
			RETURN2,	// [74] Factor = MINUS Factor; returns 'Factor' although none is marked
			Action.RETURN,	// [75] Factor = PrimaryFactor
			Action.RETURN,	// [76] PrimaryFactor = LhsExpression
			Action.RETURN,	// [77] PrimaryFactor = FunctionCall
			Action.RETURN,	// [78] PrimaryFactor = ArrayExpression
			Action.RETURN,	// [79] PrimaryFactor = STRING_LITERAL
			Action.RETURN,	// [80] PrimaryFactor = INT_LITERAL
			Action.RETURN,	// [81] PrimaryFactor = Boolean
			RETURN3,	// [82] PrimaryFactor = LPAREN Expression RPAREN; returns 'RPAREN' although none is marked
			RETURN4,	// [83] FunctionCall = ID LPAREN ExpressionListEmpty RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [84] ExpressionListEmpty = ExpressionList
			Action.NONE,  	// [85] ExpressionListEmpty = 
			RETURN2,	// [86] ExpressionList = Expression ExpressionListY; returns 'ExpressionListY' although none is marked
			RETURN3,	// [87] ExpressionListY = COMMA Expression ExpressionListY; returns 'ExpressionListY' although none is marked
			RETURN3,	// [88] ArrayExpression = LBRACKET ExpressionList RBRACKET; returns 'RBRACKET' although none is marked
			RETURN37	// [89] Dummy = MODULE INT VOID IF ELSE WHILE RETURN BREAK BOOLEAN PUBLIC TRUE FALSE INT_LITERAL STRING_LITERAL ID TYPE IMPORT PLUS MINUS TIMES DIV MOD EQEQ NEQ LEQ GEQ LT GT LBRACKET RPAREN COMMA RCURLY LCURLY SEMICOLON RBRACKET LPAREN EQL; returns 'EQL' although none is marked
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}

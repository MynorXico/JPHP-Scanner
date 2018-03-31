package php.scanner;
public enum Token { 
    ID, EQUALS, PLUS, TIMES, ASSIGN, MINUS, ERROR,  
    AROP, CMPOP, LOGOP, ASSOP, INCDECOP, PRNTHSS, CURLY,  
    BRACKET, SEMICOLON, COMMA, BOOL, INT, DOUBLE, STRING,  
    VARID, CONSTANT, CTRLSTRCT, RSRVDVAR, COMMENT, DB, FUNC,  
    NEWLINE, BLANK, MAGCONSTANT, RSRVWRDS, PHP, CONCAT  
     
} 
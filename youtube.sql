--전체 테이블, 시퀀스 삭제--
drop table myuser CASCADE CONSTRAINTS;
drop table video CASCADE CONSTRAINTS;
drop table comment CASCADE CONSTRAINTS;
drop table board CASCADE CONSTRAINTS;
drop table bobycom CASCADE CONSTRAINTS;
drop table commentlike CASCADE CONSTRAINTS;
drop table watchrecord CASCADE CONSTRAINTS;
drop table aftervideo CASCADE CONSTRAINTS;
drop table videolike CASCADE CONSTRAINTS;
drop table theme CASCADE CONSTRAINTS;
drop table hint CASCADE CONSTRAINTS;
drop table subscrib CASCADE CONSTRAINTS;
drop sequence myuser_seq;
drop sequence video_seq;
drop sequence comment_seq;
drop sequence bobycom_seq;
drop sequence board_seq;
-- 전체 테이블, 시퀀스 삭제--

--시퀀스---
create sequence myuser_seq
start with 1
increment by 1;
nocache;

create sequence video_seq
start with 1
increment by 1;
nocache;

create sequence comment_seq
start with 1
increment by 1;
nocache;

create sequence bobycom_seq
start with 1
increment by 1;
nocache;

create sequence board_seq
start with 1
increment by 1;
nocache;
--시퀀스----

/* 회원 정보 */
CREATE TABLE MYUSER (
	userNo NUMBER NOT NULL, /* 크리에이터 */
	userId VARCHAR2(100) NOT NULL, /* 아이디 */
	userPwd VARCHAR2(100) NOT NULL, /* 비밀번호 */
	userName VARCHAR2(50) NOT NULL, /* 이름 */
	userPhone NUMBER NOT NULL, /* 폰번호 */
	userEmail VARCHAR2(255) NOT NULL, /* 이메일 */
	userJoin TIMESTAMP DEFAULT sysdate, /* 가입일 */
	userSub NUMBER DEFAULT 0 /* 구독자수 */
);

CREATE UNIQUE INDEX PK_USER
	ON USER (
		userNo ASC
	);

ALTER TABLE USER
	ADD
		CONSTRAINT PK_USER
		PRIMARY KEY (
			userNo
		);


/* 시청 기록 */
CREATE TABLE WATCHRECORD (
	userNo NUMBER, /* 크리에이터 */
	vidNo NUMBER, /* 영상 번호 */
	watchDate TIMESTAMP DEFAULT sysdate /* 시청 날짜 */
);

/* 영상좋아요 */
CREATE TABLE VIDEOLIKE (
	vidNo NUMBER, /* 영상 번호 */
	userNo NUMBER /* 크리에이터 */
);

/* 나중에볼 동영상 */
CREATE TABLE AFTERVIDEO (
	userNo NUMBER, /* 크리에이터 */
	vidNo NUMBER /* 영상 번호 */
);

/* 댓글좋아요 */
CREATE TABLE COMMENTLIKE (
	comNo NUMBER, /* 댓글 번호 */
	userNo NUMBER /* 크리에이터 */
);

/* 태마별 영상 */
CREATE TABLE THEME (
	thNo NUMBER NOT NULL, /* 태마번호 */
	thName VARCHAR2(100) NOT NULL /* 태마이름 */
);

CREATE UNIQUE INDEX PK_THEME
	ON THEME (
		thNo ASC
	);

ALTER TABLE THEME
	ADD
		CONSTRAINT PK_THEME
		PRIMARY KEY (
			thNo
		);

/* 구독 자 */
CREATE TABLE SUBSCRIB (
	userNo2 NUMBER, /* 크리에이터 */
	userNo NUMBER /* 구독자 */
);

/* 영상 */
CREATE TABLE VIDEO (
	vidNo NUMBER NOT NULL, /* 영상 번호 */
	vidTitle VARCHAR2(255) NOT NULL, /* 제목 */
	vidHits NUMBER DEFAULT 0, /* 조회수 */
	vidCom VARCHAR2(255) DEFAULT 0, /* 댓글 */
	vidLike NUMBER DEFAULT 0, /* 좋아요 */
	vidDate TIMESTAMP DEFAULT sysdate, /* 업로드 시간 */
	vidEx VARCHAR2(255), /* 영상 설명 */
	vidTheme NUMBER NOT NULL, /* 태마 번호 */
	userNo NUMBER /* 크리에이터 */
);


CREATE UNIQUE INDEX PK_VIDEO
	ON VIDEO (
		vidNo ASC
	);

ALTER TABLE VIDEO
	ADD
		CONSTRAINT PK_VIDEO
		PRIMARY KEY (
			vidNo
		);

/* 영상댓글 */
CREATE TABLE COMMENT (
	comNo NUMBER NOT NULL, /* 댓글 번호 */
	comCon VARCHAR2(255), /* 내용 */
	comDate TIMESTAMP DEFAULT sysdate, /* 날짜 */
	comRe NUMBER DEFAULT 0, /* 답글수 */
	comLike NUMBER DEFAULT 0, /* 좋아요 */
	comSec NUMBER DEFAULT 0, /* 비밀글 여부 */
	vidNo NUMBER, /* 영상 번호 */
	userNo NUMBER, /* 크리에이터 */
	comStep NUMBER DEFAULT 0, /* 댓글 단계 */
	comSort NUMBER DEFAULT 0, /* 댓글 정렬 번호 */
	comGroup NUMBER /* 댓글 그룹 번호 */
);

CREATE UNIQUE INDEX PK_COMMENT
	ON COMMENT (
		comNo ASC
	);

ALTER TABLE COMMENT
	ADD
		CONSTRAINT PK_COMMENT
		PRIMARY KEY (
			comNo
		);

/* 게시글 댓글 */
CREATE TABLE BOBYCOM (
	bcNo NUMBER NOT NULL, /* 댓글 번호 */
	bcCom VARCHAR2(255), /* 내용 */
	bcDate TIMESTAMP DEFAULT sysdate, /* 날짜 */
	bcRe NUMBER DEFAULT 0, /* 답글수 */
	bcLike NUMBER DEFAULT 0, /* 좋아요 */
	bcSec NUMBER DEFAULT 0, /* 비밀글 여부 */
	bcStep NUMBER DEFAULT 0, /* 댓글 단계 */
	bcSort NUMBER DEFAULT 0, /* 댓글 정렬 번호 */
	bcGroupNo NUMBER, /* 댓글 그룹 번호 */
	boNo NUMBER, /* 번호 */
	userNo NUMBER /* 크리에이터 */
);


CREATE UNIQUE INDEX PK_BOBYCOM
	ON BOBYCOM (
		bcNo ASC
	);

ALTER TABLE BOBYCOM
	ADD
		CONSTRAINT PK_BOBYCOM
		PRIMARY KEY (
			bcNo
		);

/* 게시판 */
CREATE TABLE BOARD (
	boNo NUMBER NOT NULL, /* 번호 */
	boTitle VARCHAR2(255) NOT NULL, /* 제목 */
	boCon CLOB, /* 내용 */
	boHits NUMBER DEFAULT 0, /* 조회수 */
	boCom NUMBER DEFAULT 0, /* 댓글수 */
	boDate TIMESTAMP DEFAULT sysdate, /* 작성일 */
	boSec NUMBER DEFAULT 0, /* 비밀글 여부 */
	userNo NUMBER, /* 크리에이터 */
	userNo2 NUMBER, /* 글쓴이 */
	boMyNo NUMBER DEFAULT 1, /* 마이페이지별 글번호 */
	boStep NUMBER DEFAULT 0, /* 게시글 단계 */
	boSort NUMBER DEFAULT 0, /* 게시글 정렬 번호 */
	boGroupNo NUMBER /* 게시글 그룹번호 */
);

CREATE UNIQUE INDEX PK_BOARD
	ON BOARD (
		boNo ASC
	);

ALTER TABLE BOARD
	ADD
		CONSTRAINT PK_BOARD
		PRIMARY KEY (
			boNo
		);

/* 힌트 질문  */
CREATE TABLE HINT (
	hintQuest VARCHAR2(255) NOT NULL, /* 질문 */
	hintAns VARCHAR2(255) NOT NULL, /* 답 */
	userNo NUMBER /* 크리에이터 */
);

ALTER TABLE WATCHRECORD
	ADD
		CONSTRAINT FK_USER_TO_WATCHRECORD
		FOREIGN KEY (
			userNo
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE WATCHRECORD
	ADD
		CONSTRAINT FK_VIDEO_TO_WATCHRECORD
		FOREIGN KEY (
			vidNo
		)
		REFERENCES VIDEO (
			vidNo
		);

ALTER TABLE VIDEOLIKE
	ADD
		CONSTRAINT FK_VIDEO_TO_VIDEOLIKE
		FOREIGN KEY (
			vidNo
		)
		REFERENCES VIDEO (
			vidNo
		);

ALTER TABLE VIDEOLIKE
	ADD
		CONSTRAINT FK_USER_TO_VIDEOLIKE
		FOREIGN KEY (
			userNo
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE AFTERVIDEO
	ADD
		CONSTRAINT FK_USER_TO_AFTERVIDEO
		FOREIGN KEY (
			userNo
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE AFTERVIDEO
	ADD
		CONSTRAINT FK_VIDEO_TO_AFTERVIDEO
		FOREIGN KEY (
			vidNo
		)
		REFERENCES VIDEO (
			vidNo
		);

ALTER TABLE COMMENTLIKE
	ADD
		CONSTRAINT FK_COMMENT_TO_COMMENTLIKE
		FOREIGN KEY (
			comNo
		)
		REFERENCES COMMENT (
			comNo
		);

ALTER TABLE COMMENTLIKE
	ADD
		CONSTRAINT FK_USER_TO_COMMENTLIKE
		FOREIGN KEY (
			userNo
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE SUBSCRIB
	ADD
		CONSTRAINT FK_USER_TO_SUBSCRIB
		FOREIGN KEY (
			userNo2
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE SUBSCRIB
	ADD
		CONSTRAINT FK_USER_TO_SUBSCRIB2
		FOREIGN KEY (
			userNo
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE VIDEO
	ADD
		CONSTRAINT FK_USER_TO_VIDEO
		FOREIGN KEY (
			userNo
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE COMMENT
	ADD
		CONSTRAINT FK_VIDEO_TO_COMMENT
		FOREIGN KEY (
			vidNo
		)
		REFERENCES VIDEO (
			vidNo
		);

ALTER TABLE COMMENT
	ADD
		CONSTRAINT FK_USER_TO_COMMENT
		FOREIGN KEY (
			userNo
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE BOBYCOM
	ADD
		CONSTRAINT FK_BOARD_TO_BOBYCOM
		FOREIGN KEY (
			boNo
		)
		REFERENCES BOARD (
			boNo
		);

ALTER TABLE BOBYCOM
	ADD
		CONSTRAINT FK_USER_TO_BOBYCOM
		FOREIGN KEY (
			userNo
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE BOARD
	ADD
		CONSTRAINT FK_USER_TO_BOARD
		FOREIGN KEY (
			userNo
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE BOARD
	ADD
		CONSTRAINT FK_USER_TO_BOARD2
		FOREIGN KEY (
			userNo2
		)
		REFERENCES USER (
			userNo
		);

ALTER TABLE HINT
	ADD
		CONSTRAINT FK_USER_TO_HINT
		FOREIGN KEY (
			userNo
		)
		REFERENCES USER (
			userNo
		);
        
        


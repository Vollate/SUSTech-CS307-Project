package com.TheEnd.www.db.requestTypes;

public
enum PostOpType {
  GetPost("GetPost"),
  AddPost("AddPost"), AddReply("AddReply"), AddSecondReply("AddSecondReply"),
  DeletePost("DeletePost"), DeleteReply("DeleteReply"),
  DeleteSecondaryReply("DeleteSecondaryReply"), GetCategories("GetCategories");

  private final String name;

  PostOpType(String name){this.name = name;}

public String getName() { return name; }
}

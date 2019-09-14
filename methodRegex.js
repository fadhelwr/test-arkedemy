function isUsernamePassword(username, password) {
    var Regexu = /^[a-zA-Z][a-zA-Z0-9-_\.]{6,9}$/i;
    var Regexp = /^[a-zA-Z0-9-_\.]{2,8}$/i;
    Regexu.test(username);
    Regexp.test(password);
  
    return true;
}


// Cara menggunakan fungsi di atas
if (isUsernamePassword("aaat3st1ng", "bar4cuszzs$")) {
    alert("Username cocok") ;
  alert("Pass cocok") ;
} else {
    alert("Username Is Invalid") ;
}

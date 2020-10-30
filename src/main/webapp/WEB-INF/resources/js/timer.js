$(function(){
var note = $('#note'),
ts = new Date(2015, 7, 1);

$('#countdown').countdown({
timestamp : ts,
callback : function(minutes, seconds){

var message = "";
message += days + " day" + ( days==1 ? '':'s' ) + ", ";
message += hours + " hour" + ( hours==1 ? '':'s' ) + ", ";
message += minutes + " minute" + ( minutes==1 ? '':'s' ) + " and ";
message += seconds + " second" + ( seconds==1 ? '':'s' ) + " <br />";
message += "left for 1st August!";
note.html(message);
}
});

});
function del(id) {
    $.ajax({
 url:"http://127.0.0.1:8081/web-delStu/"+id,
type:"get",
        dataType:'json',
contentType:"application/json",
        success:function (data) {
        if (data.code==200)
            location.href=data.path;
        }
    })
}
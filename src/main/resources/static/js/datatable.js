/**
 * Created by SHACKOX on 20/12/16.
 */
$(document).ready( function () {
    var table = $('#employeesTable').DataTable({
        "sAjaxSource": "/employees",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "id"},
            { "mData": "name" },
            { "mData": "lastName" },
            { "mData": "email" },
            { "mData": "phone" },
            { "mData": "active" }
        ]
    })
});

<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="球星名" prop="playerName">
        <el-input
          v-model="queryParams.playerName"
          placeholder="请输入球星名"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="球星性别" prop="sex">
        <el-select v-model="queryParams.sex" placeholder="请选择球星性别" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="头像地址" prop="avatar">
        <el-input
          v-model="queryParams.avatar"
          placeholder="请输入头像地址"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据1" prop="data1">
        <el-input
          v-model="queryParams.data1"
          placeholder="请输入数据1"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据2" prop="data2">
        <el-input
          v-model="queryParams.data2"
          placeholder="请输入数据2"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据3" prop="data3">
        <el-input
          v-model="queryParams.data3"
          placeholder="请输入数据3"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据4" prop="data4">
        <el-input
          v-model="queryParams.data4"
          placeholder="请输入数据4"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据5" prop="data5">
        <el-input
          v-model="queryParams.data5"
          placeholder="请输入数据5"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据6" prop="data6">
        <el-input
          v-model="queryParams.data6"
          placeholder="请输入数据6"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="状态" prop="status">
        <el-select v-model="queryParams.status" placeholder="请选择状态" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-button type="cyan" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:datas:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:datas:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:datas:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:datas:export']"
        >导出</el-button>
      </el-col>
	  <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="datasList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="球星ID" align="center" prop="playerId" />
      <el-table-column label="球星名" align="center" prop="playerName" />
      <el-table-column label="球星性别" align="center" prop="sex" />
      <el-table-column label="头像地址" align="center" prop="avatar" />
      <el-table-column label="数据1" align="center" prop="data1" />
      <el-table-column label="数据2" align="center" prop="data2" />
      <el-table-column label="数据3" align="center" prop="data3" />
      <el-table-column label="数据4" align="center" prop="data4" />
      <el-table-column label="数据5" align="center" prop="data5" />
      <el-table-column label="数据6" align="center" prop="data6" />
      <el-table-column label="状态" align="center" prop="status" />
      <el-table-column label="备注" align="center" prop="remark" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:datas:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:datas:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改球星数据对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="球星名" prop="playerName">
          <el-input v-model="form.playerName" placeholder="请输入球星名" />
        </el-form-item>
        <el-form-item label="球星性别" prop="sex">
          <el-select v-model="form.sex" placeholder="请选择球星性别">
            <el-option label="请选择字典生成" value="" />
          </el-select>
        </el-form-item>
        <el-form-item label="头像地址" prop="avatar">
          <el-input v-model="form.avatar" placeholder="请输入头像地址" />
        </el-form-item>
        <el-form-item label="数据1" prop="data1">
          <el-input v-model="form.data1" placeholder="请输入数据1" />
        </el-form-item>
        <el-form-item label="数据2" prop="data2">
          <el-input v-model="form.data2" placeholder="请输入数据2" />
        </el-form-item>
        <el-form-item label="数据3" prop="data3">
          <el-input v-model="form.data3" placeholder="请输入数据3" />
        </el-form-item>
        <el-form-item label="数据4" prop="data4">
          <el-input v-model="form.data4" placeholder="请输入数据4" />
        </el-form-item>
        <el-form-item label="数据5" prop="data5">
          <el-input v-model="form.data5" placeholder="请输入数据5" />
        </el-form-item>
        <el-form-item label="数据6" prop="data6">
          <el-input v-model="form.data6" placeholder="请输入数据6" />
        </el-form-item>
        <el-form-item label="状态">
          <el-radio-group v-model="form.status">
            <el-radio label="1">请选择字典生成</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="删除标志" prop="delFlag">
          <el-input v-model="form.delFlag" placeholder="请输入删除标志" />
        </el-form-item>
        <el-form-item label="备注" prop="remark">
          <el-input v-model="form.remark" type="textarea" placeholder="请输入内容" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listDatas, getDatas, delDatas, addDatas, updateDatas } from "@/api/system/datas";

export default {
  name: "Datas",
  components: {
  },
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 球星数据表格数据
      datasList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        playerName: null,
        sex: null,
        avatar: null,
        data1: null,
        data2: null,
        data3: null,
        data4: null,
        data5: null,
        data6: null,
        status: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        playerName: [
          { required: true, message: "球星名不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询球星数据列表 */
    getList() {
      this.loading = true;
      listDatas(this.queryParams).then(response => {
        this.datasList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        playerId: null,
        playerName: null,
        sex: null,
        avatar: null,
        data1: null,
        data2: null,
        data3: null,
        data4: null,
        data5: null,
        data6: null,
        status: "0",
        delFlag: null,
        createTime: null,
        updateTime: null,
        remark: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.playerId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加球星数据";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const playerId = row.playerId || this.ids
      getDatas(playerId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改球星数据";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.playerId != null) {
            updateDatas(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addDatas(this.form).then(response => {
              this.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const playerIds = row.playerId || this.ids;
      this.$confirm('是否确认删除球星数据编号为"' + playerIds + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delDatas(playerIds);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        })
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/datas/export', {
        ...this.queryParams
      }, `system_datas.xlsx`)
    }
  }
};
</script>